package deezer.model.data;

import deezer.model.User;

import java.io.Serializable;
import java.util.StringJoiner;

public class Users extends Data<User, Users> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Override
    protected Users self() {
        return this;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Users.class.getSimpleName() + "{", "}")
                .add("data=" + this.data)
                .add("checksum=" + (this.checksum == null ? null : "'" + this.checksum + "'"))
                .add("total=" + this.total)
                .add("previousResults=" + this.previousResults)
                .add("nextResults=" + this.nextResults)
                .toString();
    }

}
