package deezer.model.search;

import deezer.model.interfaces.Searchable;

public class TracksSearch extends Search<Searchable> {

    public enum SearchOrder {
        RANKING,
        TRACK_ASC,
        TRACK_DESC,
        ARTIST_ASC,
        ARTIST_DESC,
        ALBUM_ASC,
        ALBUM_DESC,
        RATING_ASC,
        RATING_DESC,
        DURATION_ASC,
        DURATION_DESC;
    }

    private SearchOrder order;
    private String artistQuery;
    private String albumQuery;
    private String trackQuery;
    private String labelQuery;
    private Integer minDuration;
    private Integer maxDuration;
    private Integer minBpm;
    private Integer maxBpm;

    public TracksSearch(String query) {
        super(query);
    }

    public TracksSearch(String query, boolean strict) {
        super(query, strict);
    }

    public TracksSearch(String query, SearchOrder order) {
        super(query);
        this.order = order;
    }

    public TracksSearch(String query, boolean strict, SearchOrder order) {
        super(query, strict);
        this.order = order;
    }

    public SearchOrder getOrder() {
        return this.order;
    }

    public TracksSearch setOrder(SearchOrder order) {
        this.order = order;
        return this;
    }

    public String getArtistQuery() {
        return this.artistQuery;
    }

    public TracksSearch setArtistQuery(String artistQuery) {
        this.artistQuery = artistQuery;
        return this;
    }

    public String getAlbumQuery() {
        return this.albumQuery;
    }

    public TracksSearch setAlbumQuery(String albumQuery) {
        this.albumQuery = albumQuery;
        return this;
    }

    public String getTrackQuery() {
        return this.trackQuery;
    }

    public TracksSearch setTrackQuery(String trackQuery) {
        this.trackQuery = trackQuery;
        return this;
    }

    public String getLabelQuery() {
        return this.labelQuery;
    }

    public TracksSearch setLabelQuery(String labelQuery) {
        this.labelQuery = labelQuery;
        return this;
    }

    public Integer getMinDuration() {
        return this.minDuration;
    }

    public TracksSearch setMinDuration(Integer minDuration) {
        this.minDuration = minDuration;
        return this;
    }

    public Integer getMaxDuration() {
        return this.maxDuration;
    }

    public TracksSearch setMaxDuration(Integer maxDuration) {
        this.maxDuration = maxDuration;
        return this;
    }

    public Integer getMinBpm() {
        return this.minBpm;
    }

    public TracksSearch setMinBpm(Integer minBpm) {
        this.minBpm = minBpm;
        return this;
    }

    public Integer getMaxBpm() {
        return this.maxBpm;
    }

    public TracksSearch setMaxBpm(Integer maxBpm) {
        this.maxBpm = maxBpm;
        return this;
    }


}
