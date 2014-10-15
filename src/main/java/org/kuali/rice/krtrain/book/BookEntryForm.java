package org.kuali.rice.krtrain.book;

import java.util.Date;

import org.kuali.rice.krad.web.bind.RequestAccessible;
import org.kuali.rice.krad.web.form.UifFormBase;

/**
 * Form class for the Book Entry View
 *
 * @author KRAD Training
 */
public class BookEntryForm extends UifFormBase {
    private static final long serialVersionUID = 2113794438746300917L;

    @RequestAccessible
    private Book book;
    private Date entryDate;

    public BookEntryForm() {
        super();
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }
}
