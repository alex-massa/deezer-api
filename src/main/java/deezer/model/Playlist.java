package deezer.model;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import deezer.model.data.Tracks;
import util.URLTypeAdapter;

import java.net.URL;

public class Playlist {

    private Long id;
    private String title;
    private String description;
    private Integer duration;
    @SerializedName("public")
    private Boolean isPublic;
    @SerializedName("is_loved_track")
    private Boolean isLovedTracksPlaylist;
    @SerializedName("collaborative")
    private Boolean isCollaborative;
    private Integer rating;
    @SerializedName("nb_track")
    private Integer numberOfTracks;
    @SerializedName("unseen_track_count")
    private Integer unseenTracksCount;
    @SerializedName("fans")
    private Integer numberOfFans;
    @JsonAdapter(URLTypeAdapter.class)
    private URL link;
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
    private String checksum;
    private User creator;
    private Tracks tracks;

    private Integer position;

    public Long getId() {
        return this.id;
    }

    public Playlist setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return this.title;
    }

    public Playlist setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Playlist setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getDuration() {
        return this.duration;
    }

    public Playlist setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public Boolean isPublic() {
        return this.isPublic;
    }

    public Playlist setPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }

    public Boolean isLovedTracksPlaylist() {
        return this.isLovedTracksPlaylist;
    }

    public Playlist setLovedTracksPlaylist(Boolean isLovedTracksPlaylist) {
        this.isLovedTracksPlaylist = isLovedTracksPlaylist;
        return this;
    }

    public Boolean isCollaborative() {
        return this.isCollaborative;
    }

    public Playlist setCollaborative(Boolean isCollaborative) {
        this.isCollaborative = isCollaborative;
        return this;
    }

    public Integer getRating() {
        return this.rating;
    }

    public Playlist setRating(Integer rating) {
        this.rating = rating;
        return this;
    }

    public Integer getNumberOfTracks() {
        return this.numberOfTracks;
    }

    public Playlist setNumberOfTracks(Integer numberOfTracks) {
        this.numberOfTracks = numberOfTracks;
        return this;
    }

    public Integer getUnseenTracksCount() {
        return this.unseenTracksCount;
    }

    public Playlist setUnseenTracksCount(Integer unseenTracksCount) {
        this.unseenTracksCount = unseenTracksCount;
        return this;
    }

    public Integer getNumberOfFans() {
        return this.numberOfFans;
    }

    public Playlist setNumberOfFans(Integer numberOfFans) {
        this.numberOfFans = numberOfFans;
        return this;
    }

    public URL getLink() {
        return this.link;
    }

    public Playlist setLink(URL link) {
        this.link = link;
        return this;
    }

    public URL getShare() {
        return this.share;
    }

    public Playlist setShare(URL share) {
        this.share = share;
        return this;
    }

    public URL getPicture() {
        return this.picture;
    }

    public Playlist setPicture(URL picture) {
        this.picture = picture;
        return this;
    }

    public URL getSmallPicture() {
        return this.smallPicture;
    }

    public Playlist setSmallPicture(URL smallPicture) {
        this.smallPicture = smallPicture;
        return this;
    }

    public URL getMediumPicture() {
        return this.mediumPicture;
    }

    public Playlist setMediumPicture(URL mediumPicture) {
        this.mediumPicture = mediumPicture;
        return this;
    }

    public URL getBigPicture() {
        return this.bigPicture;
    }

    public Playlist setBigPicture(URL bigPicture) {
        this.bigPicture = bigPicture;
        return this;
    }

    public URL getXlPicture() {
        return this.xlPicture;
    }

    public Playlist setXlPicture(URL xlPicture) {
        this.xlPicture = xlPicture;
        return this;
    }

    public String getChecksum() {
        return this.checksum;
    }

    public Playlist setChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }

    public User getCreator() {
        return this.creator;
    }

    public Playlist setCreator(User creator) {
        this.creator = creator;
        return this;
    }

    public Tracks getTracks() {
        return this.tracks;
    }

    public Playlist setTracks(Tracks tracks) {
        this.tracks = tracks;
        return this;
    }

    public Integer getPosition() {
        return this.position;
    }

    public Playlist setPosition(Integer position) {
        this.position = position;
        return this;
    }
    
}
