package org.kuali.rice.krtrain.book;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.kuali.rice.krad.bo.DataObjectBase;
import org.kuali.rice.krad.data.jpa.converters.BooleanYNConverter;

/**
 * Book Chapter Entity
 *
 * @author KRAD Training
 */
@Entity
@Table(name="KRTRAIN_CHAPTER_T")
public class Chapter extends DataObjectBase {
    private static final long serialVersionUID = -7959433888441638987L;

	@Id
	@Column(name="BOOK_ID")
    private Long bookId;
	
	@Id
	@Column(name="NUM")
    private int number;
	
	@Column(name="TITLE")
    private String title;
	
	@Column(name="PART")
    private String part;
	
	@Column(name="SUMM")
    private String summary;
	
	@Column(name="NUM_PAGES")
    private int numberPages;
	
	@Convert(converter = BooleanYNConverter.class)
	@Column(name="REC")
    private boolean recap;
	
	@Column(name="REC_PAGE_NUM")
    private int recapPageNumber;
	
    @ManyToOne
    @JoinColumn(name = "BOOK_ID" ,insertable=false, updatable=false)
	private Book book;

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

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
}
