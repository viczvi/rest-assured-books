package model;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.STRING)
public class SearchResponse {

    private Integer start;
    private Integer num_found;
    private Integer numFound;
    private Docs[] docs;

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getNum_found() {
        return num_found;
    }

    public void setNum_found(int num_found) {
        this.num_found = num_found;
    }

    public Integer getNumFound() {
        return numFound;
    }

    public void setNumFound(int numFound) {
        this.numFound = numFound;
    }

    public Docs[] getDocs() {
        return docs;
    }

    public void setDocs(Docs[] docs) {
        this.docs = docs;
    }

    public SearchResponse(Integer start, Integer num_found, Integer numFound, Docs[] docs) {
        this.start = start;
        this.num_found = num_found;
        this.numFound = numFound;
        this.docs = docs;
    }

    public SearchResponse() {
        super();
    }
}
