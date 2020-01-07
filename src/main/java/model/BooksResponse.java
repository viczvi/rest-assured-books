package model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@JsonFormat(shape = JsonFormat.Shape.STRING)
public class BooksResponse {

    private String comment;

    public BooksResponse(String comment, String author, String ip, Date created, String data, String key, String action, String authorId, String changes, Integer id, String machineComment, Integer revision) {
        this.comment = comment;
        this.author = author;
        this.ip = ip;
        this.created = created;
        this.data = data;
        this.key = key;
        this.action = action;
        this.authorId = authorId;
        this.changes = changes;
        this.id = id;
        this.machineComment = machineComment;
        this.revision = revision;
    }

    private String author;
    private String ip;
    private Date created;
    private String data;
    private String key;
    private String action;

    @JsonProperty("author_id")
    private String authorId;
    private String changes;
    private Integer id;

    @JsonProperty("machine_comment")
    private String machineComment;
    private Integer revision;

    public BooksResponse() {
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getChanges() {
        return changes;
    }

    public void setChanges(String changes) {
        this.changes = changes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMachineComment() {
        return machineComment;
    }

    public void setMachineComment(String machineComment) {
        this.machineComment = machineComment;
    }

    public Integer getRevision() {
        return revision;
    }

    public void setRevision(Integer revision) {
        this.revision = revision;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
