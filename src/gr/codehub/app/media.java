package gr.codehub.app;

public class media {
    private String filename;
    private String description;
    private String size;
    private String type;

    public media(String filename, String description, String size, String type) {
        this.filename = filename;
        this.description = description;
        this.size = size;
        this.type = type;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "media{" +
                "filename='" + filename + '\'' +
                ", description='" + description + '\'' +
                ", size=" + size +
                ", type='" + type + '\'' +
                '}';
    }
}
