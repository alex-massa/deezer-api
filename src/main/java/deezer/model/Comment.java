package deezer.model;

import deezer.model.interfaces.Commentable;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

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

    @Override
    public String toString() {
        return  "Comment{" +
                "id=" + this.id + ", " +
                "text=" + (this.text == null ? null : "'" + this.text + "'") + ", " +
                "date=" + this.date + ", " +
                "object=" + this.object + ", " +
                "author=" + this.author +
                "}";
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (other == null || this.getClass() != other.getClass())
            return false;
        Comment comment = (Comment) other;
        return  Objects.equals(this.id, comment.id) &&
                Objects.equals(this.text, comment.text) &&
                Objects.equals(this.date, comment.date) &&
                Objects.equals(this.object, comment.object) &&
                Objects.equals(this.author, comment.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.text, this.date, this.object, this.author);
    }

}
