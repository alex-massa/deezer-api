package deezer.model.data;

import deezer.model.Playlist;

import java.io.Serializable;

public class Playlists extends Data<Playlist> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return  "Playlists{" +
                "data=" + this.data + ", " +
                "checksum=" + (this.checksum == null ? null : "'" + this.checksum + "'") + ", " +
                "total=" + this.total + ", " +
                "previousResults=" + this.previousResults + ", " +
                "nextResults=" + this.nextResults +
                "}";
    }

}
