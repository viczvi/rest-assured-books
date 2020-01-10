package model;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.STRING)
public class Links {
    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    private String self;
}
