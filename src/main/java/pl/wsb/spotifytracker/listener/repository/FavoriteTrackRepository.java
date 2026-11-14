package pl.wsb.spotifytracker.listener.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.wsb.spotifytracker.listener.entity.FavoriteTrack;

import java.util.List;

public interface FavoriteTrackRepository extends JpaRepository<FavoriteTrack, Long> {

    List<FavoriteTrack> findByTrack_Title(String title);

    List<FavoriteTrack> findByListener_DisplayHandle(String displayHandle);
}
