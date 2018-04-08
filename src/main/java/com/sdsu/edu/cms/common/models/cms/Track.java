package com.sdsu.edu.cms.common.models.cms;

public class Track {

    private int trackId;
    private String track_name;
    private String[] keywords;
    private String valid;

    public Track(int trackId, String track_name, String[] keywords, String valid) {
        this.trackId = trackId;
        this.track_name = track_name;
        this.keywords = keywords;
        this.valid = valid;
    }

    public Track() {

    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getTrack_name() {
        return track_name;
    }

    public void setTrack_name(String track_name) {
        this.track_name = track_name;
    }

    public String[] getKeywords() {
        return keywords;
    }

    public void setKeywords(String[] keywords) {
        this.keywords = keywords;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }
}
