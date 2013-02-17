package org.kuali.rice.krtrain.book;

import org.kuali.rice.core.api.util.type.KualiDecimal;
import org.kuali.rice.krad.bo.PersistableBusinessObjectBase;

import java.util.*;

/**
 * Book Entity
 *
 * @author KRAD Training
 */
public class Book extends PersistableBusinessObjectBase {
    private static final long serialVersionUID = -1826848285097280432L;

    private Long id;
   	private String title;
   	private String typeCode;
   	private String isbn;
   	private String publisher;
    private String publisherCode;
    private String publisherAddress;
    private String publisherState;
   	private Date publicationDate;
    private int numberPublisherBooks;
   	private KualiDecimal price;
    private String shortSummary;
    private String longSummary;

    private Map<String, Integer> ratings;

    private boolean fiction;
    private boolean annual;
    private int edition;
    private String bindingType;

    private String coverArt;
    private String coverArtist;
    private byte[] coverImage;

    private String preparerSignature;
    private int numberValidDays;

    private String bookAwardOne;
    private String bookAwardTwo;

    private List<String> wearAndTear;
    private List<String> languages;
    private List<String> availableFormats;
    private List<Integer> averageReview;

    private BookType bookType;
    private Author author;
    private PublisherCode pubCode;

    private List<Chapter> chapters;
    private List<IndexEntry> index;
    private List<Book> relatedBooks;

    public Book() {
        super();

        isbn = "";
        edition = 1;
        ratings = new HashMap<String, Integer>();
        chapters = new ArrayList<Chapter>();
        index = new ArrayList<IndexEntry>();
        relatedBooks = new ArrayList<Book>();
        availableFormats = new ArrayList<String>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getNumberPublisherBooks() {
        return numberPublisherBooks;
    }

    public void setNumberPublisherBooks(int numberPublisherBooks) {
        this.numberPublisherBooks = numberPublisherBooks;
    }

    public KualiDecimal getPrice() {
        return price;
    }

    public void setPrice(KualiDecimal price) {
        this.price = price;
    }

    public Map<String, Integer> getRatings() {
        return ratings;
    }

    public void setRatings(Map<String, Integer> ratings) {
        this.ratings = ratings;
    }

    public boolean isFiction() {
        return fiction;
    }

    public void setFiction(boolean fiction) {
        this.fiction = fiction;
    }

    public boolean isAnnual() {
        return annual;
    }

    public void setAnnual(boolean annual) {
        this.annual = annual;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public String getCoverArt() {
        return coverArt;
    }

    public void setCoverArt(String coverArt) {
        this.coverArt = coverArt;
    }

    public String getCoverArtist() {
        return coverArtist;
    }

    public void setCoverArtist(String coverArtist) {
        this.coverArtist = coverArtist;
    }

    public List<String> getWearAndTear() {
        return wearAndTear;
    }

    public void setWearAndTear(List<String> wearAndTear) {
        this.wearAndTear = wearAndTear;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getPublisherCode() {
        return publisherCode;
    }

    public void setPublisherCode(String publisherCode) {
        this.publisherCode = publisherCode;
    }

    public String getPublisherAddress() {
        return publisherAddress;
    }

    public void setPublisherAddress(String publisherAddress) {
        this.publisherAddress = publisherAddress;
    }

    public String getPublisherState() {
        return publisherState;
    }

    public void setPublisherState(String publisherState) {
        this.publisherState = publisherState;
    }

    public String getShortSummary() {
        return shortSummary;
    }

    public void setShortSummary(String shortSummary) {
        this.shortSummary = shortSummary;
    }

    public String getLongSummary() {
        return longSummary;
    }

    public void setLongSummary(String longSummary) {
        this.longSummary = longSummary;
    }

    public byte[] getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(byte[] coverImage) {
        this.coverImage = coverImage;
    }

    public String getPreparerSignature() {
        return preparerSignature;
    }

    public void setPreparerSignature(String preparerSignature) {
        this.preparerSignature = preparerSignature;
    }

    public int getNumberValidDays() {
        return numberValidDays;
    }

    public void setNumberValidDays(int numberValidDays) {
        this.numberValidDays = numberValidDays;
    }

    public String getBookAwardOne() {
        return bookAwardOne;
    }

    public void setBookAwardOne(String bookAwardOne) {
        this.bookAwardOne = bookAwardOne;
    }

    public String getBookAwardTwo() {
        return bookAwardTwo;
    }

    public void setBookAwardTwo(String bookAwardTwo) {
        this.bookAwardTwo = bookAwardTwo;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public List<String> getAvailableFormats() {
        return availableFormats;
    }

    public void setAvailableFormats(List<String> availableFormats) {
        this.availableFormats = availableFormats;
    }

    public List<Integer> getAverageReview() {
        return averageReview;
    }

    public void setAverageReview(List<Integer> averageReview) {
        this.averageReview = averageReview;
    }

    public PublisherCode getPubCode() {
        return pubCode;
    }

    public void setPubCode(PublisherCode pubCode) {
        this.pubCode = pubCode;
    }

    public List<IndexEntry> getIndex() {
        return index;
    }

    public void setIndex(List<IndexEntry> index) {
        this.index = index;
    }

    public List<Book> getRelatedBooks() {
        return relatedBooks;
    }

    public void setRelatedBooks(List<Book> relatedBooks) {
        this.relatedBooks = relatedBooks;
    }
}
