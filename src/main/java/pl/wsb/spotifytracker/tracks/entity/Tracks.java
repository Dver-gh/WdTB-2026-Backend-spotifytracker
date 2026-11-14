package pl.wsb.spotifytracker.tracks.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import pl.wsb.spotifytracker.ArtistAlbums.entity.ArtistAlbums;

@Entity
@Table(name = "tracks")
public class Tracks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "track_id", nullable = false)
    private int track_id;

    @Column(name = "title", length = 50, nullable = false)
    private String title;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "album_id", nullable = false)
    private ArtistAlbums album;

    @Column(name = "duration_ms", nullable = false)
    private int duration_ms;

    @Column(name = "popularity", nullable = true)
    private int popularity;

    @Embedded
    private AudioFeatures audioFeatures;

    protected Tracks() {
    }

    public Tracks(int track_id, String title, ArtistAlbums album, int duration_ms, int popularity, AudioFeatures audioFeatures) {
        this.track_id = track_id;
        this.title = title;
        this.album = album;
        this.duration_ms = duration_ms;
        this.popularity = popularity;
        this.audioFeatures = audioFeatures;
    }

    public int getTrack_id() {
        return track_id;
    }

    public String getTitle() {
        return title;
    }

    public ArtistAlbums getAlbum() {
        return album;
    }

    public int getDuration_ms() {
        return duration_ms;
    }

    public int getPopularity() {
        return popularity;
    }

    public AudioFeatures getAudioFeatures() {
        return audioFeatures;
    }
}
