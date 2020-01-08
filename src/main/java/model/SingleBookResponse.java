package model;

import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.HashMap;
import java.util.Map;

public class SingleBookResponse {

    private Map<String, Object> rootElement = new HashMap<>();

    private BookDetails bookDetails;

    public SingleBookResponse() {
    }

    @JsonAnySetter
    public void setRootElement(String key, Object value) {
        rootElement.put(key, value);
    }

    public Object getRootElement() {
        return rootElement;
    }

    public BookDetails getBookDetails() {
        return bookDetails;
    }

    public void setBookDetails(BookDetails bookeDetails) {
        this.bookDetails = bookeDetails;
    }
}
