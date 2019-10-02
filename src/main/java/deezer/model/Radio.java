package deezer.model;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import util.URLTypeAdapter;

import java.net.URL;

public class Radio {

    private Long radio;
    private String title;
    private String description;
    @JsonAdapter(URLTypeAdapter.class)
    private URL share;
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
    @JsonAdapter(URLTypeAdapter.class)
    private URL tracklist;

    public Long getRadio() {
        return this.radio;
    }

    public Radio setRadio(Long radio) {
        this.radio = radio;
        return this;
    }

    public String getTitle() {
        return this.title;
    }

    public Radio setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Radio setDescription(String description) {
        this.description = description;
        return this;
    }

    public URL getShare() {
        return this.share;
    }

    public Radio setShare(URL share) {
        this.share = share;
        return this;
    }

    public URL getPicture() {
        return this.picture;
    }

    public Radio setPicture(URL picture) {
        this.picture = picture;
        return this;
    }

    public URL getSmallPicture() {
        return this.smallPicture;
    }

    public Radio setSmallPicture(URL smallPicture) {
        this.smallPicture = smallPicture;
        return this;
    }

    public URL getMediumPicture() {
        return this.mediumPicture;
    }

    public Radio setMediumPicture(URL mediumPicture) {
        this.mediumPicture = mediumPicture;
        return this;
    }

    public URL getBigPicture() {
        return this.bigPicture;
    }

    public Radio setBigPicture(URL bigPicture) {
        this.bigPicture = bigPicture;
        return this;
    }

    public URL getXlPicture() {
        return this.xlPicture;
    }

    public Radio setXlPicture(URL xlPicture) {
        this.xlPicture = xlPicture;
        return this;
    }

    public URL getTracklist() {
        return this.tracklist;
    }

    public Radio setTracklist(URL tracklist) {
        this.tracklist = tracklist;
        return this;
    }
    
}
