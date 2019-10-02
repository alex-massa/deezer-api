package deezer.model;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import util.URLTypeAdapter;

import java.net.URL;

public class Offer {

    private long id;
    private String name;
    private Float amount;
    private String currency;
    @SerializedName("displayed_amount")
    private String displayedAmount;
    @SerializedName("tc") @JsonAdapter(URLTypeAdapter.class)
    private URL termsAndConditions;
    @SerializedName("tc_html") @JsonAdapter(URLTypeAdapter.class)
    private URL htmlTermsAndConditions;
    @SerializedName("tc_txt") @JsonAdapter(URLTypeAdapter.class)
    private URL textTermsAndConditions;
    @SerializedName("try_and_buy")
    private Integer tryAndBuy;

    public long getId() {
        return this.id;
    }

    public Offer setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Offer setName(String name) {
        this.name = name;
        return this;
    }

    public String getCurrency() {
        return this.currency;
    }

    public Offer setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getDisplayedAmount() {
        return this.displayedAmount;
    }

    public Offer setDisplayedAmount(String displayedAmount) {
        this.displayedAmount = displayedAmount;
        return this;
    }

    public URL getTermsAndConditions() {
        return this.termsAndConditions;
    }

    public Offer setTermsAndConditions(URL termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
        return this;
    }

    public URL getHtmlTermsAndConditions() {
        return this.htmlTermsAndConditions;
    }

    public Offer setHtmlTermsAndConditions(URL htmlTermsAndConditions) {
        this.htmlTermsAndConditions = htmlTermsAndConditions;
        return this;
    }

    public URL getTextTermsAndConditions() {
        return this.textTermsAndConditions;
    }

    public Offer setTextTermsAndConditions(URL textTermsAndConditions) {
        this.textTermsAndConditions = textTermsAndConditions;
        return this;
    }

    public Integer getTryAndBuy() {
        return this.tryAndBuy;
    }

    public Offer setTryAndBuy(Integer tryAndBuy) {
        this.tryAndBuy = tryAndBuy;
        return this;
    }

    public Float getAmount() {
        return this.amount;
    }

    public Offer setAmount(Float amount) {
        this.amount = amount;
        return this;
    }
    
}
