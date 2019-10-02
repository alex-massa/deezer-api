package deezer.model.data;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import util.URLTypeAdapter;

import java.net.URL;
import java.util.List;

public abstract class Data<T> {

    private List<T> data;
    private String checksum;
    private Integer total;
    @SerializedName("prev") @JsonAdapter(URLTypeAdapter.class)
    private URL previousResults;
    @SerializedName("next") @JsonAdapter(URLTypeAdapter.class)
    private URL nextResults;

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

}
