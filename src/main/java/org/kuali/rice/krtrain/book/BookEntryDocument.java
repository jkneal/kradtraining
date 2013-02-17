package org.kuali.rice.krtrain.book;

import org.kuali.rice.krad.document.TransactionalDocumentBase;

/**
 * Transactional Document for Book Entry
 *
 * @author KRAD Training
 */
public class BookEntryDocument extends TransactionalDocumentBase {
	private static final long serialVersionUID = -1467264998048357139L;
	
	private Long bookId;
	private Book book;
	
	public BookEntryDocument() {
		super();
		
		book = new Book();
	}
	
	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

}
