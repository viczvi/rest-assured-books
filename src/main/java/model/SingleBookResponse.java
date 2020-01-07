package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SingleBookResponse {

    @JsonProperty("ISBN:0201558025")
    private String isbnCode;

    private BookDetails bookeDetails;

    public String getIsbnCode() {
        return isbnCode;
    }

    public SingleBookResponse() {
    }

    public void setIsbnCode(String isbnCode) {
        this.isbnCode = isbnCode;
    }

    public BookDetails getBookeDetails() {
        return bookeDetails;
    }

    public void setBookeDetails(BookDetails bookeDetails) {
        this.bookeDetails = bookeDetails;
    }
}
