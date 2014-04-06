package org.kuali.rice.krtrain.book;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.kuali.rice.krad.bo.DataObjectBase;
import org.kuali.rice.krad.data.jpa.PortableSequenceGenerator;

/**
 * Author Entity
 *
 * @author KRAD Training
 */
@Entity
@Table(name="KRTRAIN_AUTHOR_T")
public class Author extends DataObjectBase {
    private static final long serialVersionUID = 4875037872755501161L;

	@Id
	@Column(name="AUTHOR_ID")
    @PortableSequenceGenerator(name = "KRTRAIN_AUTHOR_ID_S")
    @GeneratedValue(generator = "KRTRAIN_AUTHOR_ID_S")
    private Long authorId;
	
    @Column(name = "NM")
   	private String authorName;
    
    @Column(name = "EMAIL")
   	private String email;
    
    @Column(name = "PHONE_NBR")
   	private String phoneNumber;

    @Transient
    private int numberWrittenBooks;
    
    @Transient
    private int numberPublishedBooks;

    @Transient
    private String city;
    
    @Transient
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
