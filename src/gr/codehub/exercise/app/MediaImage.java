package gr.codehub.exercise.app;

public class MediaImage extends MediaFile {

    public MediaImage() {}
    public MediaImage(String id, String name) { super(id, name); }
    public MediaImage(String id, String name, String description) { super(id, name, description); }

    @Override
    public String toString() {
        return "{" +
                    "type: Image, " +
                    "data: " + super.toString() +
               "}";
    }
}
