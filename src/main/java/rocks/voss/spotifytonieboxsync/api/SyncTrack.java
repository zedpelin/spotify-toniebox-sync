package rocks.voss.spotifytonieboxsync.api;

public interface SyncTrack {
    String getId();
    String getUri();
    String[] getArtists();
    String getName();
    int getDiscNumber();
    int getTrackNumber();
    String getAlbumName();
    Object getOriginalTrack();
    String getCacheLocation();
}
