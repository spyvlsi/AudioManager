package gr.codehub.app;

public class audioFiles extends media {

    private float duration;
    private String artist;

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getMediaType(){
        return "audio";
    }


    public audioFiles(String filename, float duration, String description, float size, String type) {
        super(filename, description, size, type);
    }

    public audioFiles(String filename, String description, float size, String type, float duration, String artist, String filetype) {
        super(filename, description, size, type);
        this.duration = duration;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "audioFiles{" +
                "duration=" + duration +
                ", artist='" + artist + '\'' +
                '}';
    }
}
