package deezer.model;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import util.URLTypeAdapter;

import java.net.URL;
import java.util.Date;
import java.util.List;

public class User {

    public static class ExplicitContentLevels {

        public static final String DISPLAY = "explicit_display";
        public static final String NO_RECOMMENDATION = "explicit_no_recommendation";
        public static final String HIDE = "explicit_hide";

    }

    private Long id;
    private String name;
    @SerializedName("lastname")
    private String lastName;
    @SerializedName("firstname")
    private String firstName;
    private String email;
    private Integer status;
    private Date birthday;
    @SerializedName("inscription_date")
    private Date inscriptionDate;
    private Character gender;
    @JsonAdapter(URLTypeAdapter.class)
    private URL link;
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
    private String country;
    @SerializedName("lang")
    private String language;
    @SerializedName("is_kid")
    private Boolean isKid;
    @SerializedName("explicit_content_level")
    private String explicitContentLevel;
    @SerializedName("explicit_content_levels_available")
    private List<String> availableExplicitContentLevels;
    @SerializedName("tracklist") @JsonAdapter(URLTypeAdapter.class)
    private URL tracklist;

    public Long getId() {
        return this.id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getLastName() {
        return this.lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public Integer getStatus() {
        return this.status;
    }

    public User setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    public User setBirthday(Date birthday) {
        this.birthday = birthday;
        return this;
    }

    public Date getInscriptionDate() {
        return this.inscriptionDate;
    }

    public User setInscriptionDate(Date inscriptionDate) {
        this.inscriptionDate = inscriptionDate;
        return this;
    }

    public Character getGender() {
        return this.gender;
    }

    public User setGender(Character gender) {
        this.gender = gender;
        return this;
    }

    public URL getLink() {
        return this.link;
    }

    public User setLink(URL link) {
        this.link = link;
        return this;
    }

    public URL getPicture() {
        return this.picture;
    }

    public User setPicture(URL picture) {
        this.picture = picture;
        return this;
    }

    public URL getSmallPicture() {
        return this.smallPicture;
    }

    public User setSmallPicture(URL smallPicture) {
        this.smallPicture = smallPicture;
        return this;
    }

    public URL getMediumPicture() {
        return this.mediumPicture;
    }

    public User setMediumPicture(URL mediumPicture) {
        this.mediumPicture = mediumPicture;
        return this;
    }

    public URL getBigPicture() {
        return this.bigPicture;
    }

    public User setBigPicture(URL bigPicture) {
        this.bigPicture = bigPicture;
        return this;
    }

    public URL getXlPicture() {
        return this.xlPicture;
    }

    public User setXlPicture(URL xlPicture) {
        this.xlPicture = xlPicture;
        return this;
    }

    public String getCountry() {
        return this.country;
    }

    public User setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getLanguage() {
        return this.language;
    }

    public User setLanguage(String language) {
        this.language = language;
        return this;
    }

    public Boolean isKid() {
        return this.isKid;
    }

    public User setKid(Boolean isKid) {
        this.isKid = isKid;
        return this;
    }

    public String getExplicitContentLevel() {
        return this.explicitContentLevel;
    }

    public User setExplicitContentLevel(String explicitContentLevel) {
        this.explicitContentLevel = explicitContentLevel;
        return this;
    }

    public List<String> getAvailableExplicitContentLevels() {
        return this.availableExplicitContentLevels;
    }

    public User setAvailableExplicitContentLevels(List<String> availableExplicitContentLevels) {
        this.availableExplicitContentLevels = availableExplicitContentLevels;
        return this;
    }

    public URL getTracklist() {
        return this.tracklist;
    }

    public User setTracklist(URL tracklist) {
        this.tracklist = tracklist;
        return this;
    }
    
}
