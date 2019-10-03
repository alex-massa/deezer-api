package deezer.model.data;

import deezer.model.Artist;

import java.io.Serializable;

public class Artists extends Data<Artist> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return  "Artists{" +
                "data=" + this.data + ", " +
                "checksum=" + (this.checksum == null ? null : "'" + this.checksum + "'") + ", " +
                "total=" + this.total + ", " +
                "previousResults=" + this.previousResults + ", " +
                "nextResults=" + this.nextResults +
                "}";
    }

}
