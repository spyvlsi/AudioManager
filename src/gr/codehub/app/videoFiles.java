package gr.codehub.app;

public class videoFiles extends media {

    private float duration;
    private String resolution;
    private String filetype;


    public videoFiles(String filename, String description, String size, String type) {
        super(filename, description, size, type);
    }

    public videoFiles(String filename, String description, String size, String type, float duration, String resolution, String filetype) {
        super(filename, description, size, type);
        this.duration = duration;
        this.resolution = resolution;
        this.filetype = filetype;
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

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    @Override
    public String toString() {
        return "videoFiles{" +
                "duration=" + duration +
                ", resolution='" + resolution + '\'' +
                '}';
    }
}
