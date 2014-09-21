package org.kuali.rice.krtrain.book;

import org.kuali.rice.krad.bo.DataObjectBase;

/**
 * Author Entity
 *
 * @author KRAD Training
 */
public class Author extends DataObjectBase {
    private static final long serialVersionUID = 4875037872755501161L;

    private Long authorId;
   	private String authorName;
   	private String email;
   	private String phoneNumber;

    private int numberWrittenBooks;
    private int numberPublishedBooks;

    private String city;
    private String state;

    public Author(){
        super();
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getNumberWrittenBooks() {
        return numberWrittenBooks;
    }

    public void setNumberWrittenBooks(int numberWrittenBooks) {
        this.numberWrittenBooks = numberWrittenBooks;
    }

    public int getNumberPublishedBooks() {
        return numberPublishedBooks;
    }

    public void setNumberPublishedBooks(int numberPublishedBooks) {
        this.numberPublishedBooks = numberPublishedBooks;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
