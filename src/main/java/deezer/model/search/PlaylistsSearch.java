package deezer.model.search;

import deezer.model.Playlist;

public class PlaylistsSearch extends Search<Playlist> {

    public PlaylistsSearch(String query) {
        super(query);
    }

    public PlaylistsSearch(String query, boolean strict) {
        super(query, strict);
    }

}
