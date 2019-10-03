package deezer.model.search;

import deezer.model.interfaces.Searchable;

public abstract class Search<T extends Searchable> {

    String query;
    boolean strict;

    Search(String query) {
        this.query = query;
    }

    Search(String query, boolean strict) {
        this(query);
        this.strict = strict;
    }

    public String getQuery() {
        return this.query;
    }

    public Search setQuery(String query) {
        this.query = query;
        return this;
    }

    public boolean isStrict() {
        return this.strict;
    }

    public Search setStrict(boolean strict) {
        this.strict = strict;
        return this;
    }

}
