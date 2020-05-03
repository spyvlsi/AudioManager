package gr.codehub.app;

public class imgFiles extends media {

    private String creator;
    private String quality;
    private String filetype;

    public imgFiles(String filename, String description, String size, String type) {
        super(filename, description, size, type);
    }

    public imgFiles(String filename, String description, String size, String type, String creator, String quality, String filetype) {
        super(filename, description, size, type);
        this.creator = creator;
        this.quality = quality;
        this.filetype = filetype;
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

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    @Override
    public String toString() {
        return "imgFiles{" +
                "creator='" + creator + '\'' +
                ", quality='" + quality + '\'' +
                '}';
    }
}
