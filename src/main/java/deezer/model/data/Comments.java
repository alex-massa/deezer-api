package deezer.model.data;

import deezer.model.Comment;

import java.io.Serializable;

public class Comments extends Data<Comment> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return  "Comments{" +
                "data=" + this.data + ", " +
                "checksum=" + (this.checksum == null ? null : "'" + this.checksum + "'") + ", " +
                "total=" + this.total + ", " +
                "previousResults=" + this.previousResults + ", " +
                "nextResults=" + this.nextResults +
                "}";
    }

}
