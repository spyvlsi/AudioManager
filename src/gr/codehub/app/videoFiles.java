package gr.codehub.app;

public class videoFiles extends media {

    private float duration;
    private String resolution;

    public videoFiles(String filename, String description, float size, String type) {
        super(filename, description, size, type);
    }

    public videoFiles(String filename, String description, float size, String type, float duration, String resolution, String filetype) {
        super(filename, description, size, type);
        this.duration = duration;
        this.resolution = resolution;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getMediaType(){
        return "video";
    }

    @Override
    public String toString() {
        return "videoFiles{" +
                "duration=" + duration +
                ", resolution='" + resolution + '\'' +
                '}';
    }
}
