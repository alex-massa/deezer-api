package deezer.model.data;

import deezer.model.Podcast;

import java.io.Serializable;

public class Podcasts extends Data<Podcast> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return  "Podcasts{" +
                "data=" + this.data + ", " +
                "checksum=" + (this.checksum == null ? null : "'" + this.checksum + "'") + ", " +
                "total=" + this.total + ", " +
                "previousResults=" + this.previousResults + ", " +
                "nextResults=" + this.nextResults +
                "}";
    }

}
