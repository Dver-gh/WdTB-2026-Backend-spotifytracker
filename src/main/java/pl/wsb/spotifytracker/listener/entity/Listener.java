package pl.wsb.spotifytracker.listener.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import pl.wsb.spotifytracker.account.domain.UserAccount;

import java.time.LocalDateTime;

@Entity
@Table(name = "listener")
public class Listener {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_account_id", nullable = false, unique = true)
    private UserAccount account;

    @Column(name = "display_handle", nullable = false, length = 60)
    private String displayHandle;

    @Column(name = "favorite_genre", length = 50)
    private String favoriteGenre;

    @Column(name = "country", length = 2)
    private String country;

    @Column(name = "joined_at", nullable = false)
    private LocalDateTime joinedAt;

    protected Listener() {
    }

    public Listener(UserAccount account, String displayHandle, String favoriteGenre, String country) {
        this.account = account;
        this.displayHandle = displayHandle;
        this.favoriteGenre = favoriteGenre;
        this.country = country;
        this.joinedAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public UserAccount getAccount() {
        return account;
    }

    public String getDisplayHandle() {
        return displayHandle;
    }

    public String getFavoriteGenre() {
        return favoriteGenre;
    }

    public String getCountry() {
        return country;
    }

    public LocalDateTime getJoinedAt() {
        return joinedAt;
    }
}
