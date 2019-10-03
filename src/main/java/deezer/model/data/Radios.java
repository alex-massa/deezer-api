package deezer.model.data;

import deezer.model.Radio;

import java.io.Serializable;

public class Radios extends Data<Radio> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return  "Radios{" +
                "data=" + this.data + ", " +
                "checksum=" + (this.checksum == null ? null : "'" + this.checksum + "'") + ", " +
                "total=" + this.total + ", " +
                "previousResults=" + this.previousResults + ", " +
                "nextResults=" + this.nextResults +
                "}";
    }

}
