package builders;

import model.BooksResponse;

import java.util.Date;

public final class BooksResponseBuilder {
    private String comment;
    private String author;
    private String ip;
    private Date created;
    private String data;
    private String key;
    private String action;
    private String authorId;
    private String changes;
    private Integer id;
    private String machineComment;
    private Integer revision;

    private BooksResponseBuilder() {
    }

    public static BooksResponseBuilder aBooksResponse() {
        return new BooksResponseBuilder();
    }

    public BooksResponseBuilder withComment(String comment) {
        this.comment = comment;
        return this;
    }

    public BooksResponseBuilder withAuthor(String author) {
        this.author = author;
        return this;
    }

    public BooksResponseBuilder withIp(String ip) {
        this.ip = ip;
        return this;
    }

    public BooksResponseBuilder withCreated(Date created) {
        this.created = created;
        return this;
    }

    public BooksResponseBuilder withData(String data) {
        this.data = data;
        return this;
    }

    public BooksResponseBuilder withKey(String key) {
        this.key = key;
        return this;
    }

    public BooksResponseBuilder withAction(String action) {
        this.action = action;
        return this;
    }

    public BooksResponseBuilder withAuthorId(String authorId) {
        this.authorId = authorId;
        return this;
    }

    public BooksResponseBuilder withChanges(String changes) {
        this.changes = changes;
        return this;
    }

    public BooksResponseBuilder withId(Integer id) {
        this.id = id;
        return this;
    }

    public BooksResponseBuilder withMachineComment(String machineComment) {
        this.machineComment = machineComment;
        return this;
    }

    public BooksResponseBuilder withRevision(Integer revision) {
        this.revision = revision;
        return this;
    }

    public BooksResponse build() {
        BooksResponse booksResponse = new BooksResponse();
        booksResponse.setComment(comment);
        booksResponse.setAuthor(author);
        booksResponse.setIp(ip);
        booksResponse.setCreated(created);
        booksResponse.setData(data);
        booksResponse.setKey(key);
        booksResponse.setAction(action);
        booksResponse.setAuthorId(authorId);
        booksResponse.setChanges(changes);
        booksResponse.setId(id);
        booksResponse.setMachineComment(machineComment);
        booksResponse.setRevision(revision);
        return booksResponse;
    }
}
