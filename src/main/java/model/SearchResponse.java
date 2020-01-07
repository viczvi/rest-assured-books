package model;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.STRING)
public class SearchResponse {

    private int start;
    private int num_found;
    private int numFound;
    private Docs[] docs;

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getNum_found() {
        return num_found;
    }

    public void setNum_found(int num_found) {
        this.num_found = num_found;
    }

    public int getNumFound() {
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

    public SearchResponse(int start, int num_found, int numFound, Docs[] docs) {
        this.start = start;
        this.num_found = num_found;
        this.numFound = numFound;
        this.docs = docs;
    }

    public SearchResponse() {
        super();
    }
}
