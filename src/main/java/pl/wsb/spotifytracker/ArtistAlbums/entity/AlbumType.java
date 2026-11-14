package pl.wsb.spotifytracker.ArtistAlbums.entity;

/**
 * Rodzaj wydawnictwa muzycznego. Zapisywany w bazie jako tekst
 * ({@code @Enumerated(EnumType.STRING)}), żeby zmiana kolejności stałych
 * nie zepsuła istniejących danych.
 */
public enum AlbumType {
    SINGLE,
    EP,
    ALBUM,
    COMPILATION
}
