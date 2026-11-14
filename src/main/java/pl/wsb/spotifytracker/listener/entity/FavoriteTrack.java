package pl.wsb.spotifytracker.listener.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import pl.wsb.spotifytracker.tracks.entity.Tracks;

import java.time.LocalDateTime;

@Entity
@Table(name = "favorite_track",
        uniqueConstraints = @UniqueConstraint(columnNames = {"listener_id", "track_id"}))
public class FavoriteTrack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "listener_id", nullable = false)
    private Listener listener;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "track_id", nullable = false)
    private Tracks track;

    @Column(name = "added_at", nullable = false)
    private LocalDateTime addedAt;

    @Column(name = "play_count", nullable = false)
    private int playCount;

    protected FavoriteTrack() {
    }

    public FavoriteTrack(Listener listener, Tracks track, int playCount) {
        this.listener = listener;
        this.track = track;
        this.playCount = playCount;
        this.addedAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public Listener getListener() {
        return listener;
    }

    public Tracks getTrack() {
        return track;
    }

    public LocalDateTime getAddedAt() {
        return addedAt;
    }

    public int getPlayCount() {
        return playCount;
    }
}
