package org.kuali.rice.krtrain.book;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.kuali.rice.core.api.util.type.KualiDecimal;
import org.kuali.rice.krad.util.GlobalVariables;
import org.kuali.rice.krad.util.KRADConstants;
import org.kuali.rice.krad.web.controller.TransactionalDocumentControllerBase;
import org.kuali.rice.krad.web.form.DocumentFormBase;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller for the Book Entry View
 *
 * @author KRAD Training
 */
@Controller
@RequestMapping(value = "/bookEntry")
public class BookEntryController extends TransactionalDocumentControllerBase {

    protected static final String SAVE_OVERRIDE_DIALOG = "saveOverrideDialog";

    @Override
    protected DocumentFormBase createInitialForm(HttpServletRequest httpServletRequest) {
        return new BookEntryForm();
    }

    /**
     * Hard codes sample data for testing the view
     */
    @RequestMapping(params = "methodToCall=loadSampleData")
    public ModelAndView loadSampleData(@ModelAttribute("KualiForm") BookEntryForm form, BindingResult result,
                                       HttpServletRequest request, HttpServletResponse response) {

        Book book = ((BookEntryDocument) form.getDocument()).getBook();

        if (book == null) {
            book = new Book();
        }

        boolean addAddtionalData = false;

        // additional data for exercise 37
        if (request.getParameterMap().containsKey("exercise37")) {
            addAddtionalData = true;
        }

        book.setEdition(3);
        book.setCoverArt("Moon Museum");
        book.setCoverArtist("Andy Warhol");

        if (addAddtionalData) {
            book.setIsbn("300-40389b");
        }

        List<String> wearAndTear = new ArrayList<String>();

        wearAndTear.add("front right corner bend");
        wearAndTear.add("water damage");
        wearAndTear.add("tear on page 130");
        book.setWearAndTear(wearAndTear);

        book.setNumberPublisherBooks(10);

        Author author = new Author();
        author.setNumberWrittenBooks(12);
        author.setNumberPublishedBooks(5);

        if (addAddtionalData) {
            author.setAuthorName("Joe Kul");
        }

        book.setAuthor(author);

        List<Chapter> chapters = new ArrayList<Chapter>();

        Chapter chapter = new Chapter(1, "Basics", "Introduction", 30, false);
        chapters.add(chapter);

        chapter = new Chapter(2, "Setup", "Introduction", 25, true);
        chapters.add(chapter);

        chapter = new Chapter(3, "Working in Code", "Development", 50, true);
        chapters.add(chapter);

        book.setChapters(chapters);

        List<IndexEntry> index = new ArrayList<IndexEntry>();
        index.add(new IndexEntry("Ant", "45, 46"));
        index.add(new IndexEntry("Java", "8, 9, 10, 43, 46, 48, 68, 69"));
        index.add(new IndexEntry("jQuery", "15"));
        index.add(new IndexEntry("Maven", "51, 52, 55"));
        index.add(new IndexEntry("Spring", "33, 34, 71, 72"));

        book.setIndex(index);

        List<Book> relatedBooks = new ArrayList<Book>();

        Book relatedBook = new Book();
        relatedBook.setId(new Long(2));
        relatedBook.setTitle("Spring in Action");
        relatedBook.setTypeCode("IT");
        relatedBook.setIsbn("34589-n388");
        relatedBook.setPublisher("O'Reilly");

        Calendar cal = new GregorianCalendar(2010, 8, 14);
        relatedBook.setPublicationDate(cal.getTime());
        relatedBook.setPrice(new KualiDecimal(29.50));
        relatedBook.setChapters(chapters);
        relatedBooks.add(relatedBook);

        relatedBook = new Book();
        relatedBook.setId(new Long(3));
        relatedBook.setTitle("When to Quit Programming");
        relatedBook.setTypeCode("IT");
        relatedBook.setIsbn("34589-n388");
        relatedBook.setPublisher("O'Reilly");

        relatedBook.setPublicationDate(cal.getTime());
        relatedBook.setPrice(new KualiDecimal(59.50));
        relatedBook.setChapters(chapters);
        relatedBooks.add(relatedBook);

        relatedBook = new Book();
        relatedBook.setId(new Long(4));
        relatedBook.setTitle("Java for Dummies");
        relatedBook.setTypeCode("IT");
        relatedBook.setIsbn("34589-n400");
        relatedBook.setPublisher("O'Reilly");

        relatedBook.setPublicationDate(cal.getTime());
        relatedBook.setPrice(new KualiDecimal(19.50));
        relatedBook.setChapters(chapters);
        relatedBooks.add(relatedBook);

        relatedBook = new Book();
        relatedBook.setId(new Long(5));
        relatedBook.setTitle("Rice for you");
        relatedBook.setTypeCode("IT");
        relatedBook.setIsbn("4589-n388");
        relatedBook.setChapters(chapters);
        relatedBook.setPublisher("O'Reilly");

        relatedBook.setPublicationDate(cal.getTime());
        relatedBook.setPrice(new KualiDecimal(9.50));
        relatedBook.setChapters(chapters);
        relatedBooks.add(relatedBook);

        book.setRelatedBooks(relatedBooks);

        ((BookEntryDocument) form.getDocument()).setBook(book);

        return getUIFModelAndView(form);
    }

    @RequestMapping(params = "methodToCall=saveBook")
    public ModelAndView saveBook(@ModelAttribute("KualiForm") BookEntryForm form, BindingResult result,
                                 HttpServletRequest request, HttpServletResponse response) {

        GlobalVariables.getMessageMap().putInfoForSectionId(KRADConstants.GLOBAL_MESSAGES,
                "method.invoked", "saveBook");

        if (!hasDialogBeenAnswered(SAVE_OVERRIDE_DIALOG, form)) {
            return showDialog(SAVE_OVERRIDE_DIALOG, form, request, response);
        }

        boolean continueSave = getBooleanDialogResponse(SAVE_OVERRIDE_DIALOG, form, request, response);

        if (continueSave) {
            GlobalVariables.getMessageMap().addGrowlMessage("Save Action", "book.saved", ((BookEntryDocument) form.getDocument()).getBook().getTitle());
        }

        form.getDialogManager().removeDialog(SAVE_OVERRIDE_DIALOG);

        return getUIFModelAndView(form);
    }


    @RequestMapping(params = "methodToCall=viewRatings")
    public ModelAndView viewRatings(@ModelAttribute("KualiForm") BookEntryForm form, BindingResult result,
                                    HttpServletRequest request, HttpServletResponse response) {

        GlobalVariables.getMessageMap().putInfoForSectionId(KRADConstants.GLOBAL_MESSAGES,
                "method.invoked", "viewRatings");

        return getUIFModelAndView(form);
    }

    @RequestMapping(params = "methodToCall=viewAuthorBooks")
    public ModelAndView viewAuthorBooks(@ModelAttribute("KualiForm") BookEntryForm form, BindingResult result,
                                        HttpServletRequest request, HttpServletResponse response) {

        GlobalVariables.getMessageMap().putInfoForSectionId(KRADConstants.GLOBAL_MESSAGES,
                "method.invoked", "viewAuthorBooks");

        Author author = ((BookEntryDocument) form.getDocument()).getBook().getAuthor();
        author.setNumberWrittenBooks(author.getNumberWrittenBooks() + 1);

        return getUIFModelAndView(form);
    }

    @RequestMapping(params = "methodToCall=viewBookEntry")
    public ModelAndView viewBookEntry(@ModelAttribute("KualiForm") BookEntryForm form, BindingResult result,
                                      HttpServletRequest request, HttpServletResponse response) {

        GlobalVariables.getMessageMap().putInfoForSectionId(KRADConstants.GLOBAL_MESSAGES,
                "method.invoked", "viewBookEntry");

        return getUIFModelAndView(form);
    }

    /**
     * Sample method for getting action parameters
     */
    @RequestMapping(params = "methodToCall=viewPublisher")
    public ModelAndView viewPublisher(@ModelAttribute("KualiForm") BookEntryForm form, BindingResult result,
                                      HttpServletRequest request, HttpServletResponse response) {

        String format = form.getActionParamaterValue("format");

        if (StringUtils.equals("summary", format)) {
            // do summary logic
        } else if (StringUtils.equals("detail", format)) {
            // do detail logic
        } else {
            // throw exception or default
        }

        return getUIFModelAndView(form);
    }
}
