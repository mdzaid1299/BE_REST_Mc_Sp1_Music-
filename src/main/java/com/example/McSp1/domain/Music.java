package com.example.McSp1.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Music {

    @Id
    private  int trackId;
    private String trackName, trackComments,trackArtist;
    private int trackRating;

    public Music(int trackId, String trackName, String trackComments, String trackArtist, int trackRating) {
        this.trackId = trackId;
        this.trackName = trackName;
        this.trackComments = trackComments;
        this.trackArtist = trackArtist;
        this.trackRating = trackRating;
    }

    public Music() {
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getTrackComments() {
        return trackComments;
    }

    public void setTrackComments(String trackComments) {
        this.trackComments = trackComments;
    }

    public String getTrackArtist() {
        return trackArtist;
    }

    public void setTrackArtist(String trackArtist) {
        this.trackArtist = trackArtist;
    }

    public int getTrackRating() {
        return trackRating;
    }

    public void setTrackRating(int trackRating) {
        this.trackRating = trackRating;
    }

    @Override
    public String toString() {
        return "Music{" +
                "trackId=" + trackId +
                ", trackName='" + trackName + '\'' +
                ", trackComments='" + trackComments + '\'' +
                ", trackArtist='" + trackArtist + '\'' +
                ", trackRating=" + trackRating +
                '}';
    }
}
