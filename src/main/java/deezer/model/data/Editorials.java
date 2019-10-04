package deezer.model.data;

import deezer.model.Editorial;

import java.io.Serializable;
import java.util.StringJoiner;

public class Editorials extends Data<Editorial, Editorials> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Override
    protected Editorials self() {
        return this;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Editorials.class.getSimpleName() + "{", "}")
                .add("data=" + this.data)
                .add("checksum=" + (this.checksum == null ? null : "'" + this.checksum + "'"))
                .add("total=" + this.total)
                .add("previousResults=" + this.previousResults)
                .add("nextResults=" + this.nextResults)
                .toString();
    }

}
