package deezer.model.data;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

public abstract class Data<T, D extends Data<T, D>> implements Serializable, Iterable<T> {

    private static final long serialVersionUID = 1L;

    List<T> data;
    String checksum;
    Integer total;
    @SerializedName("prev")
    URL previousResults;
    @SerializedName("next")
    URL nextResults;

    public List<T> getData() {
        return this.data;
    }

    public D setData(List<T> data) {
        this.data = data;
        return this.self();
    }

    public String getChecksum() {
        return this.checksum;
    }

    public Data<T, D> setChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }

    public Integer getTotal() {
        return this.total;
    }

    public D setTotal(Integer total) {
        this.total = total;
        return this.self();
    }

    public URL getPreviousResults() {
        return this.previousResults;
    }

    public D setPreviousResults(URL previousResults) {
        this.previousResults = previousResults;
        return this.self();
    }

    public URL getNextResults() {
        return this.nextResults;
    }

    public Data<T, D> setNextResults(URL nextResults) {
        this.nextResults = nextResults;
        return this.self();
    }

    public D getAsNullIfNoData() {
        if (this.data == null || this.data.isEmpty())
            return null;
        return this.self();
    }

    protected abstract D self();

    @Override
    public Iterator<T> iterator() {
        return this.data.iterator();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Data.class.getSimpleName() + "{", "}")
                .add("data=" + this.data)
                .add("checksum=" + (this.checksum == null ? null : "'" + this.checksum + "'"))
                .add("total=" + this.total)
                .add("previousResults=" + this.previousResults)
                .add("nextResults=" + this.nextResults)
                .toString();
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (other == null || this.getClass() != other.getClass())
            return false;
        Data<?, ?> data = (Data<?, ?>) other;
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
