package builders;

import model.Docs;

public final class DocsBuilder {
    private String titleSuggest;
    private String[] publisher;
    private String[] editionKey;
    private int coverI;
    private String[] isbn;
    private boolean hasFulltext;
    private String[] text;
    private String title;
    private int lastModifiedI;
    private int editionCount;
    private String[] authorName;
    private String[] seed;
    private int firstPublishYear;
    private int[] publishYear;
    private String key;
    private String[] publishDate;
    private String[] authorKey;
    private String type;
    private int ebookCountI;
    private int[] goodreadsId;
    private int[] librarythingId;
    private String coverEditionKey;
    private String[] firstSentence;
    private String[] language;
    private int[] oclc;
    private String[] subject;
    private String[] publishPlace;
    private String[] place;
    private int[] lccn;
    private String[] person;
    private String[] contributor;
    private String[] ia;
    private String iaCollectionS;
    private String printdisabledS;
    private boolean publicScanB;
    private String[] iaBoxId;
    private String[] idOverdrive;

    private DocsBuilder() {
    }

    public static DocsBuilder aDocs() {
        return new DocsBuilder();
    }

    public DocsBuilder withTitleSuggest(String titleSuggest) {
        this.titleSuggest = titleSuggest;
        return this;
    }

    public DocsBuilder withPublisher(String[] publisher) {
        this.publisher = publisher;
        return this;
    }

    public DocsBuilder withEditionKey(String[] editionKey) {
        this.editionKey = editionKey;
        return this;
    }

    public DocsBuilder withCoverI(int coverI) {
        this.coverI = coverI;
        return this;
    }

    public DocsBuilder withIsbn(String[] isbn) {
        this.isbn = isbn;
        return this;
    }

    public DocsBuilder withHasFulltext(boolean hasFulltext) {
        this.hasFulltext = hasFulltext;
        return this;
    }

    public DocsBuilder withText(String[] text) {
        this.text = text;
        return this;
    }

    public DocsBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public DocsBuilder withLastModifiedI(int lastModifiedI) {
        this.lastModifiedI = lastModifiedI;
        return this;
    }

    public DocsBuilder withEditionCount(int editionCount) {
        this.editionCount = editionCount;
        return this;
    }

    public DocsBuilder withAuthorName(String[] authorName) {
        this.authorName = authorName;
        return this;
    }

    public DocsBuilder withSeed(String[] seed) {
        this.seed = seed;
        return this;
    }

    public DocsBuilder withFirstPublishYear(int firstPublishYear) {
        this.firstPublishYear = firstPublishYear;
        return this;
    }

    public DocsBuilder withPublishYear(int[] publishYear) {
        this.publishYear = publishYear;
        return this;
    }

    public DocsBuilder withKey(String key) {
        this.key = key;
        return this;
    }

    public DocsBuilder withPublishDate(String[] publishDate) {
        this.publishDate = publishDate;
        return this;
    }

    public DocsBuilder withAuthorKey(String[] authorKey) {
        this.authorKey = authorKey;
        return this;
    }

    public DocsBuilder withType(String type) {
        this.type = type;
        return this;
    }

    public DocsBuilder withEbookCountI(int ebookCountI) {
        this.ebookCountI = ebookCountI;
        return this;
    }

    public DocsBuilder withGoodreadsId(int[] goodreadsId) {
        this.goodreadsId = goodreadsId;
        return this;
    }

    public DocsBuilder withLibrarythingId(int[] librarythingId) {
        this.librarythingId = librarythingId;
        return this;
    }

    public DocsBuilder withCoverEditionKey(String coverEditionKey) {
        this.coverEditionKey = coverEditionKey;
        return this;
    }

    public DocsBuilder withFirstSentence(String[] firstSentence) {
        this.firstSentence = firstSentence;
        return this;
    }

    public DocsBuilder withLanguage(String[] language) {
        this.language = language;
        return this;
    }

    public DocsBuilder withOclc(int[] oclc) {
        this.oclc = oclc;
        return this;
    }

    public DocsBuilder withSubject(String[] subject) {
        this.subject = subject;
        return this;
    }

    public DocsBuilder withPublishPlace(String[] publishPlace) {
        this.publishPlace = publishPlace;
        return this;
    }

    public DocsBuilder withPlace(String[] place) {
        this.place = place;
        return this;
    }

    public DocsBuilder withLccn(int[] lccn) {
        this.lccn = lccn;
        return this;
    }

    public DocsBuilder withPerson(String[] person) {
        this.person = person;
        return this;
    }

    public DocsBuilder withContributor(String[] contributor) {
        this.contributor = contributor;
        return this;
    }

    public DocsBuilder withIa(String[] ia) {
        this.ia = ia;
        return this;
    }

    public DocsBuilder withIaCollectionS(String iaCollectionS) {
        this.iaCollectionS = iaCollectionS;
        return this;
    }

    public DocsBuilder withPrintdisabledS(String printdisabledS) {
        this.printdisabledS = printdisabledS;
        return this;
    }

    public DocsBuilder withPublicScanB(boolean publicScanB) {
        this.publicScanB = publicScanB;
        return this;
    }

    public DocsBuilder withIaBoxId(String[] iaBoxId) {
        this.iaBoxId = iaBoxId;
        return this;
    }

    public DocsBuilder withIdOverdrive(String[] idOverdrive) {
        this.idOverdrive = idOverdrive;
        return this;
    }

    public Docs build() {
        Docs docs = new Docs();
        docs.setTitleSuggest(titleSuggest);
        docs.setPublisher(publisher);
        docs.setEditionKey(editionKey);
        docs.setCoverI(coverI);
        docs.setIsbn(isbn);
        docs.setHasFulltext(hasFulltext);
        docs.setText(text);
        docs.setTitle(title);
        docs.setLastModifiedI(lastModifiedI);
        docs.setEditionCount(editionCount);
        docs.setAuthorName(authorName);
        docs.setSeed(seed);
        docs.setFirstPublishYear(firstPublishYear);
        docs.setPublishYear(publishYear);
        docs.setKey(key);
        docs.setPublishDate(publishDate);
        docs.setAuthorKey(authorKey);
        docs.setType(type);
        docs.setEbookCountI(ebookCountI);
        docs.setGoodreadsId(goodreadsId);
        docs.setLibrarythingId(librarythingId);
        docs.setCoverEditionKey(coverEditionKey);
        docs.setFirstSentence(firstSentence);
        docs.setLanguage(language);
        docs.setOclc(oclc);
        docs.setSubject(subject);
        docs.setPublishPlace(publishPlace);
        docs.setPlace(place);
        docs.setLccn(lccn);
        docs.setPerson(person);
        docs.setContributor(contributor);
        docs.setIa(ia);
        docs.setIaCollectionS(iaCollectionS);
        docs.setPrintdisabledS(printdisabledS);
        docs.setPublicScanB(publicScanB);
        docs.setIaBoxId(iaBoxId);
        docs.setIdOverdrive(idOverdrive);
        return docs;
    }
}
