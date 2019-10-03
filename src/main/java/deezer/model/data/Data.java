package deezer.model.data;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import util.URLTypeAdapter;

import java.io.Serializable;
import java.net.URL;
import java.util.List;
import java.util.Objects;

public abstract class Data<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    List<T> data;
    String checksum;
    Integer total;
    @SerializedName("prev") @JsonAdapter(URLTypeAdapter.class)
    URL previousResults;
    @SerializedName("next") @JsonAdapter(URLTypeAdapter.class)
    URL nextResults;

    public List<T> getData() {
        return this.data;
    }

    public Data<T> setData(List<T> data) {
        this.data = data;
        return this;
    }

    public String getChecksum() {
        return this.checksum;
    }

    public Data<T> setChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }

    public Integer getTotal() {
        return this.total;
    }

    public Data<T> setTotal(Integer total) {
        this.total = total;
        return this;
    }

    public URL getPreviousResults() {
        return this.previousResults;
    }

    public Data<T> setPreviousResults(URL previousResults) {
        this.previousResults = previousResults;
        return this;
    }

    public URL getNextResults() {
        return this.nextResults;
    }

    public Data<T> setNextResults(URL nextResults) {
        this.nextResults = nextResults;
        return this;
    }

    @Override
    public String toString() {
        return  "Data{" +
                "data=" + this.data + ", " +
                "checksum=" + (this.checksum == null ? null : "'" + this.checksum + "'") + ", " +
                "total=" + this.total + ", " +
                "previousResults=" + this.previousResults + ", " +
                "nextResults=" + this.nextResults +
                "}";
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (other == null || this.getClass() != other.getClass())
            return false;
        Data<?> data = (Data<?>) other;
        return  Objects.equals(this.data, data.data) &&
                Objects.equals(this.checksum, data.checksum) &&
                Objects.equals(this.total, data.total) &&
                Objects.equals(this.previousResults, data.previousResults) &&
                Objects.equals(this.nextResults, data.nextResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.data, this.checksum, this.total, this.previousResults, this.nextResults);
    }

}
