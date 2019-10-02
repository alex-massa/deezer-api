package deezer.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Infos {

    @SerializedName("country_iso")
    private String countryIso;
    private String country;
    @SerializedName("open")
    private Boolean isOpen;
    private List<Offer> offers;

    public String getCountryIso() {
        return this.countryIso;
    }

    public Infos setCountryIso(String countryIso) {
        this.countryIso = countryIso;
        return this;
    }

    public String getCountry() {
        return this.country;
    }

    public Infos setCountry(String country) {
        this.country = country;
        return this;
    }

    public Boolean isOpen() {
        return this.isOpen;
    }

    public Infos setOpen(Boolean open) {
        isOpen = open;
        return this;
    }

    public List<Offer> getOffers() {
        return this.offers;
    }

    public Infos setOffers(List<Offer> offers) {
        this.offers = offers;
        return this;
    }
    
}
