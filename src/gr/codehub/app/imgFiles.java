package gr.codehub.app;

public class imgFiles extends media {

    private String creator;
    private String quality;

    public imgFiles(String filename, String description, float size, String type) {
        super(filename, description, size, type);
    }

    public imgFiles(String filename, String description, float size, String type, String creator, String quality, String filetype) {
        super(filename, description, size, type);
        this.creator = creator;
        this.quality = quality;
    }

    public String getMediaType(){
        return "image";
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "imgFiles{" +
                "creator='" + creator + '\'' +
                ", quality='" + quality + '\'' +
                '}';
    }
}
