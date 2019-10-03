package deezer.model.search;

import deezer.model.Artist;

public class ArtistsSearch extends Search<Artist> {

    public ArtistsSearch(String query) {
        super(query);
    }

    public ArtistsSearch(String query, boolean strict) {
        super(query, strict);
    }

}
