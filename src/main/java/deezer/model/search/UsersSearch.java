package deezer.model.search;

import deezer.model.interfaces.Searchable;

public class UsersSearch extends Search<Searchable> {

    public UsersSearch(String query) {
        super(query);
    }

    public UsersSearch(String query, boolean strict) {
        super(query, strict);
    }

}
