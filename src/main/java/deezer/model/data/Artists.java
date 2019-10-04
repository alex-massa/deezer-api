package deezer.model.data;

import deezer.model.Artist;

import java.io.Serializable;
import java.util.StringJoiner;

public class Artists extends Data<Artist, Artists> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Override
    protected Artists self() {
        return this;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Artists.class.getSimpleName() + "{", "}")
                .add("data=" + this.data)
                .add("checksum=" + (this.checksum == null ? null : "'" + this.checksum + "'"))
                .add("total=" + this.total)
                .add("previousResults=" + this.previousResults)
                .add("nextResults=" + this.nextResults)
                .toString();
    }

}
