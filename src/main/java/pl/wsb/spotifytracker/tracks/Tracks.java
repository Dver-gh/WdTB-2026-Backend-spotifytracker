package pl.wsb.spotifytracker.tracks;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

import java.time.LocalDate;

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

    @Column(name = "album_id", nullable = false)
    private int album_id;

    @Column(name = "duration_ms", nullable = false)
    private int duration_ms;

    @Column(name = "popularity", nullable = true)
    private int popularity;

    protected Tracks() {
    }

    public Tracks(int track_id, String title, int album_id, int duration_ms, int popularity) {
        this.track_id = track_id;
        this.title = title;
        this.album_id = album_id;
        this.duration_ms = duration_ms;
        this.popularity = popularity;
    }

    public int getTrack_id() {
        return track_id;
    }

    public String getTitle() {
        return title;
    }

    public int getAlbum_id() {
        return album_id;
    }

    public int getDuration_ms() {
        return duration_ms;
    }

    public int getPopularity() {
        return popularity;
    }
}
