# Schemat bazy danych

Plik generują reguły projektu (panel Maven → Lifecycle → verify). Nie edytujcie go ręcznie.

Tabele: 6 · kolumny: 35 · relacje: 4 × @ManyToOne, 1 × @OneToMany, 1 × @OneToOne, 0 × @ManyToMany

| Tabela | Encja | Kolumny | Klucze obce |
|---|---|---|---|
| artist_albums | ArtistAlbums | 6 | artist_id |
| artists | Artists | 5 | — |
| favorite_track | FavoriteTrack | 5 | listener_id, track_id |
| listener | Listener | 6 | user_account_id |
| tracks | Tracks | 8 | album_id |
| user_account | UserAccount | 5 | — |

```mermaid
erDiagram
    artist_albums {
        Long id PK
        String album_title
        AlbumType album_type
        Long artist_id FK
        LocalDate release_date
        int track_count
    }
    artists {
        Long id PK
        int artist_followers_count
        String artist_genre
        String artist_name
        LocalDateTime created_at
    }
    favorite_track {
        Long id PK
        LocalDateTime added_at
        Long listener_id FK
        int play_count
        Long track_id FK
    }
    listener {
        Long id PK
        String country
        String display_handle
        String favorite_genre
        LocalDateTime joined_at
        Long user_account_id FK
    }
    tracks {
        Long id PK
        Long album_id FK
        Integer bpm
        int duration_ms
        String musical_key
        int popularity
        String title
        int track_id
    }
    user_account {
        Long id PK
        LocalDateTime created_at
        String display_name
        String email
        AccountRole role
    }
    artist_albums ||--o{ tracks : "album_id"
    artists ||--o{ artist_albums : "artist_id"
    listener ||--o{ favorite_track : "listener_id"
    tracks ||--o{ favorite_track : "track_id"
    user_account ||--o| listener : "user_account_id"
```
