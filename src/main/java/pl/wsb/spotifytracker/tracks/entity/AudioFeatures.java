package pl.wsb.spotifytracker.tracks.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class AudioFeatures {

    @Column(name = "bpm")
    private Integer bpm;

    @Column(name = "musical_key", length = 10)
    private String musicalKey;

    protected AudioFeatures() {
    }

    public AudioFeatures(Integer bpm, String musicalKey) {
        this.bpm = bpm;
        this.musicalKey = musicalKey;
    }

    public Integer getBpm() {
        return bpm;
    }

    public String getMusicalKey() {
        return musicalKey;
    }
}
