package deezer.model;

import deezer.model.interfaces.Commentable;

import java.sql.Timestamp;

public class Comment {

    private Long id;
    private String text;
    private Timestamp date;
    private Commentable object;
    private User author;

    public Long getId() {
        return this.id;
    }

    public Comment setId(Long id) {
        this.id = id;
        return this;
    }

    public String getText() {
        return this.text;
    }

    public Comment setText(String text) {
        this.text = text;
        return this;
    }

    public Timestamp getDate() {
        return this.date;
    }

    public Comment setDate(Timestamp date) {
        this.date = date;
        return this;
    }

    public Commentable getObject() {
        return this.object;
    }

    public Comment setObject(Commentable object) {
        this.object = object;
        return this;
    }

    public User getAuthor() {
        return this.author;
    }

    public Comment setAuthor(User author) {
        this.author = author;
        return this;
    }
    
}
