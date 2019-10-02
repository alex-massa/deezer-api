package deezer.model.search;

public abstract class Search {

    private String query;
    private boolean strict;

    public Search(String query) {
        this.query = query;
    }

    public Search(String query, boolean strict) {
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
