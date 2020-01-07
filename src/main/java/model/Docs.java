package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.PrimitiveIterator;

public class Docs {

    public Docs() {
        super();
    }

    @JsonProperty("title_suggest")
    private String titleSuggest;

    private String[] publisher;

    @JsonProperty("edition_key")
    private String[] editionKey;

    @JsonProperty("cover_i")
    private int coverI;

    private String[] isbn;

    @JsonProperty("has_fulltext")
    private boolean hasFulltext;

    private String[] text;

    private String title;

    @JsonProperty("last_modified_i")
    private int lastModifiedI;

    @JsonProperty("edition_count")
    private int editionCount;

    @JsonProperty("author_name")
    private String[] authorName;

    private String[] seed;

    @JsonProperty("first_publish_year")
    private int firstPublishYear;

    @JsonProperty("publish_year")
    private int[] publishYear;

    private String key;

    @JsonProperty("publish_date")
    private String[] publishDate;

    @JsonProperty("author_key")
    private String[] authorKey;

    private String type;

    @JsonProperty("ebook_count_i")
    private int ebookCountI;

    @JsonProperty("id_goodreads")
    private int[] goodreadsId;

    @JsonProperty("id_librarything")
    private int[] librarythingId;

    @JsonProperty("cover_edition_key")
    private String coverEditionKey;

    @JsonProperty("first_sentence")
    private String[] firstSentence;

    private String[] language;

    private int[] oclc;

    private String[] subject;

    @JsonProperty("publish_place")
    private String[] publishPlace;

    private String[] place;

    private int[] lccn;

    private String[] person;

    private String[] contributor;

    private String[] ia;

    @JsonProperty("ia_collection_s")
    private String iaCollectionS;

    @JsonProperty("printdisabled_s")
    private String printdisabledS;

    @JsonProperty("public_scan_b")
    private boolean publicScanB;

    @JsonProperty("ia_box_id")
    private String[] iaBoxId;

    @JsonProperty("id_overdrive")
    private String[] idOverdrive;

    @JsonProperty("id_depósito_legal")
    private String[] idDepositLegal;

    public String[] getIdDepositLegal() {
        return idDepositLegal;
    }

    public void setIdDepositLegal(String[] idDepositLegal) {
        this.idDepositLegal = idDepositLegal;
    }

    public String[] getIdOverdrive() {
        return idOverdrive;
    }

    public void setIdOverdrive(String[] idOverdrive) {
        this.idOverdrive = idOverdrive;
    }

    public boolean isPublicScanB() {
        return publicScanB;
    }

    public String[] getIaBoxId() {
        return iaBoxId;
    }

    public void setIaBoxId(String[] iaBoxId) {
        this.iaBoxId = iaBoxId;
    }

    public void setPublicScanB(boolean publicScanB) {
        this.publicScanB = publicScanB;
    }

    public String getIaCollectionS() {
        return iaCollectionS;
    }

    public void setIaCollectionS(String iaCollectionS) {
        this.iaCollectionS = iaCollectionS;
    }

    public String getPrintdisabledS() {
        return printdisabledS;
    }

    public void setPrintdisabledS(String printdisabledS) {
        this.printdisabledS = printdisabledS;
    }

    public String[] getIa() {
        return ia;
    }

    public void setIa(String[] ia) {
        this.ia = ia;
    }

    public String[] getPlace() {
        return place;
    }

    public void setPlace(String[] place) {
        this.place = place;
    }

    public String[] getFirstSentence() {
        return firstSentence;
    }

    public void setFirstSentence(String[] firstSentence) {
        this.firstSentence = firstSentence;
    }

    public int[] getLibrarythingId() {
        return librarythingId;
    }

    public void setLibrarythingId(int[] librarythingId) {
        this.librarythingId = librarythingId;
    }

    public String getCoverEditionKey() {
        return coverEditionKey;
    }

    public void setCoverEditionKey(String coverEditionKey) {
        this.coverEditionKey = coverEditionKey;
    }

    public String[] getContributor() {
        return contributor;
    }

    public void setContributor(String[] contributor) {
        this.contributor = contributor;
    }

    public String getTitleSuggest() {
        return titleSuggest;
    }

    public void setTitleSuggest(String titleSuggest) {
        this.titleSuggest = titleSuggest;
    }

    public String[] getPublisher() {
        return publisher;
    }

    public void setPublisher(String[] publisher) {
        this.publisher = publisher;
    }

    public String[] getEditionKey() {
        return editionKey;
    }

    public void setEditionKey(String[] editionKey) {
        this.editionKey = editionKey;
    }

    public int getCoverI() {
        return coverI;
    }

    public void setCoverI(int coverI) {
        this.coverI = coverI;
    }

    public String[] getIsbn() {
        return isbn;
    }

    public void setIsbn(String[] isbn) {
        this.isbn = isbn;
    }

    public boolean isHasFulltext() {
        return hasFulltext;
    }

    public void setHasFulltext(boolean hasFulltext) {
        this.hasFulltext = hasFulltext;
    }

    public String[] getText() {
        return text;
    }

    public void setText(String[] text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLastModifiedI() {
        return lastModifiedI;
    }

    public void setLastModifiedI(int lastModifiedI) {
        this.lastModifiedI = lastModifiedI;
    }

    public int getEditionCount() {
        return editionCount;
    }

    public void setEditionCount(int editionCount) {
        this.editionCount = editionCount;
    }

    public String[] getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String[] authorName) {
        this.authorName = authorName;
    }

    public String[] getSeed() {
        return seed;
    }

    public void setSeed(String[] seed) {
        this.seed = seed;
    }

    public int getFirstPublishYear() {
        return firstPublishYear;
    }

    public void setFirstPublishYear(int firstPublishYear) {
        this.firstPublishYear = firstPublishYear;
    }

    public int[] getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int[] publishYear) {
        this.publishYear = publishYear;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String[] getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String[] publishDate) {
        this.publishDate = publishDate;
    }

    public String[] getAuthorKey() {
        return authorKey;
    }

    public void setAuthorKey(String[] authorKey) {
        this.authorKey = authorKey;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEbookCountI() {
        return ebookCountI;
    }

    public void setEbookCountI(int ebookCountI) {
        this.ebookCountI = ebookCountI;
    }

    public int[] getGoodreadsId() {
        return goodreadsId;
    }

    public void setGoodreadsId(int[] goodreadsId) {
        this.goodreadsId = goodreadsId;
    }

    public String[] getLanguage() {
        return language;
    }

    public void setLanguage(String[] language) {
        this.language = language;
    }

    public int[] getOclc() {
        return oclc;
    }

    public void setOclc(int[] oclc) {
        this.oclc = oclc;
    }

    public String[] getSubject() {
        return subject;
    }

    public String[] getPublishPlace() {
        return publishPlace;
    }

    public void setPublishPlace(String[] publishPlace) {
        this.publishPlace = publishPlace;
    }

    public void setSubject(String[] subject) {
        this.subject = subject;
    }

    public int[] getLccn() {
        return lccn;
    }

    public void setLccn(int[] lccn) {
        this.lccn = lccn;
    }

    public String[] getPerson() {
        return person;
    }

    public void setPerson(String[] person) {
        this.person = person;
    }


}
