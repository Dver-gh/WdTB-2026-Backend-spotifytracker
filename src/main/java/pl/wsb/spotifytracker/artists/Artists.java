package pl.wsb.spotifytracker.artists;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Table(name = "artists")
public class Artists {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "artist_name", length = 80, nullable = false)
    private String artist_name;

    @Column(name = "artist_genre", length = 50, nullable = false)
    private String artist_genre;

    @Column(name = "artist_followers_count")
    private int artist_followers_count;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    protected Artists() {
    }

    public Artists(String artist_name, String artist_genre, int artist_followers_count) {
        this.artist_name = artist_name;
        this.artist_genre = artist_genre;
        this.artist_followers_count = artist_followers_count;
        this.createdAt = LocalDateTime.now();
    }

    public String getArtist_name() {
        return artist_name;
    }

    public String getArtist_genre() {
        return artist_genre;
    }

    public int getArtist_followers_count() {
        return artist_followers_count;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
