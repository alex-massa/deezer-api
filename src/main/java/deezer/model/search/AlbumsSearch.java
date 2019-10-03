package deezer.model.search;

import deezer.model.Album;

public class AlbumsSearch extends Search<Album> {

    public AlbumsSearch(String query) {
        super(query);
    }

    public AlbumsSearch(String query, boolean strict) {
        super(query, strict);
    }

}
