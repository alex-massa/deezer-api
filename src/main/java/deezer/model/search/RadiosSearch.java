package deezer.model.search;

import deezer.model.interfaces.Searchable;

public class RadiosSearch extends Search<Searchable> {

    public RadiosSearch(String query) {
        super(query);
    }

    public RadiosSearch(String query, boolean strict) {
        super(query, strict);
    }

}
