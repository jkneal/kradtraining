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
    private BookEntryFormat format;
    private boolean auditMode;
    private boolean expertEntry;
    private String awardToAdd;

    public BookEntryForm() {
        super();

        format = new BookEntryFormat();
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

    public BookEntryFormat getFormat() {
        return format;
    }

    public void setFormat(BookEntryFormat format) {
        this.format = format;
    }

    public boolean isAuditMode() {
        return auditMode;
    }

    public void setAuditMode(boolean auditMode) {
        this.auditMode = auditMode;
    }

    public boolean isExpertEntry() {
        return expertEntry;
    }

    public void setExpertEntry(boolean expertEntry) {
        this.expertEntry = expertEntry;
    }

    public String getAwardToAdd() {
        return awardToAdd;
    }

    public void setAwardToAdd(String awardToAdd) {
        this.awardToAdd = awardToAdd;
    }
}
