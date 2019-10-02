package deezer.model;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import util.URLTypeAdapter;

import java.net.URL;

public class Editorial {

    private Long id;
    private String name;
    @JsonAdapter(URLTypeAdapter.class)
    private URL picture;
    @SerializedName("picture_small") @JsonAdapter(URLTypeAdapter.class)
    private URL smallPicture;
    @SerializedName("picture_medium") @JsonAdapter(URLTypeAdapter.class)
    private URL mediumPicture;
    @SerializedName("picture_big") @JsonAdapter(URLTypeAdapter.class)
    private URL bigPicture;
    @SerializedName("picture_xl") @JsonAdapter(URLTypeAdapter.class)
    private URL xlPicture;

    public Long getId() {
        return this.id;
    }

    public Editorial setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Editorial setName(String name) {
        this.name = name;
        return this;
    }

    public URL getPicture() {
        return this.picture;
    }

    public Editorial setPicture(URL picture) {
        this.picture = picture;
        return this;
    }

    public URL getSmallPicture() {
        return this.smallPicture;
    }

    public Editorial setSmallPicture(URL smallPicture) {
        this.smallPicture = smallPicture;
        return this;
    }

    public URL getMediumPicture() {
        return this.mediumPicture;
    }

    public Editorial setMediumPicture(URL mediumPicture) {
        this.mediumPicture = mediumPicture;
        return this;
    }

    public URL getBigPicture() {
        return this.bigPicture;
    }

    public Editorial setBigPicture(URL bigPicture) {
        this.bigPicture = bigPicture;
        return this;
    }

    public URL getXlPicture() {
        return this.xlPicture;
    }

    public Editorial setXlPicture(URL xlPicture) {
        this.xlPicture = xlPicture;
        return this;
    }
    
}
