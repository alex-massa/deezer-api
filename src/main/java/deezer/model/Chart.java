package deezer.model;

import deezer.model.data.*;

public class Chart {

    private Tracks tracks;
    private Albums albums;
    private Artists artists;
    private Playlists playlists;
    private Podcasts podcasts;

    public Tracks getTracks() {
        return this.tracks;
    }

    public Chart setTracks(Tracks tracks) {
        this.tracks = tracks;
        return this;
    }

    public Albums getAlbums() {
        return this.albums;
    }

    public Chart setAlbums(Albums albums) {
        this.albums = albums;
        return this;
    }

    public Artists getArtists() {
        return this.artists;
    }

    public Chart setArtists(Artists artists) {
        this.artists = artists;
        return this;
    }

    public Playlists getPlaylists() {
        return this.playlists;
    }

    public Chart setPlaylists(Playlists playlists) {
        this.playlists = playlists;
        return this;
    }

    public Podcasts getPodcasts() {
        return this.podcasts;
    }

    public Chart setPodcasts(Podcasts podcasts) {
        this.podcasts = podcasts;
        return this;
    }
    
}
