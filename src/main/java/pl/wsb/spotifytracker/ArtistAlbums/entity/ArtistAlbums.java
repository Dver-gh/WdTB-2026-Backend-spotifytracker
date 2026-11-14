package pl.wsb.spotifytracker.ArtistAlbums.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "artist_albums")
public class ArtistAlbums {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "album_title", length = 50, nullable = false)
    private String album_title;

    @Column(name = "artist_id", nullable = false)
    private int artist_id;

    @Column(name = "release_date", nullable = false)
    private LocalDate release_date;

    @Column(name = "track_count", nullable = false)
    private int track_count;

    @Enumerated(EnumType.STRING)
    @Column(name = "album_type", nullable = false, length = 20)
    private AlbumType album_type;

    protected ArtistAlbums() {
    }

    public ArtistAlbums(String album_title, int artist_id, LocalDate release_date, int track_count, AlbumType album_type) {
        this.album_title = album_title;
        this.artist_id = artist_id;
        this.release_date = release_date;
        this.track_count = track_count;
        this.album_type = album_type;
    }

    public String getAlbum_title() {
        return album_title;
    }

    public int getArtist_id() {
        return artist_id;
    }

    public LocalDate getRelease_date() {
        return release_date;
    }

    public int track_count() {
        return track_count;
    }

    public AlbumType getAlbum_type() {
        return album_type;
    }
}
