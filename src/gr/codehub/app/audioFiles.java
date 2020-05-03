package gr.codehub.app;

public class audioFiles extends media {

    private float duration;
    private String Artist;
    private String filetype;

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public audioFiles(String filename, float duration, String description, String size, String type) {
        super(filename, description, size, type);
    }

    public audioFiles(String filename, String description, String size, String type, float duration, String artist, String filetype) {
        super(filename, description, size, type);
        this.duration = duration;
        Artist = artist;
        this.filetype = filetype;
    }

    public void addAudioFiles(){

    }

    @Override
    public String toString() {
        return "audioFiles{" +
                "duration=" + duration +
                ", Artist='" + Artist + '\'' +
                '}';
    }
}
