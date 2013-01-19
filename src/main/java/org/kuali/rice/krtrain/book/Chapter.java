package org.kuali.rice.krtrain.book;

import org.kuali.rice.krad.bo.PersistableBusinessObjectBase;

/**
 * Book Chapter Entity
 *
 * @author KRAD Training
 */
public class Chapter extends PersistableBusinessObjectBase {
    private static final long serialVersionUID = -7959433888441638987L;

    private Long bookId;
    private int number;
    private String title;
    private String part;
    private String summary;
    private int numberPages;
    private boolean recap;
    private int recapPageNumber;

    public Chapter() {
        super();
    }

    public Chapter(int number, String title, String part, int numberPages, boolean recap) {
        super();

        this.number = number;
        this.title = title;
        this.part = part;
        this.numberPages = numberPages;
        this.recap = recap;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    public boolean isRecap() {
        return recap;
    }

    public void setRecap(boolean recap) {
        this.recap = recap;
    }

    public int getRecapPageNumber() {
        return recapPageNumber;
    }

    public void setRecapPageNumber(int recapPageNumber) {
        this.recapPageNumber = recapPageNumber;
    }
}
