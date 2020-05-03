package gr.codehub.exercise.app;

public class MediaVideo extends MediaFile {

    public MediaVideo() {}
    public MediaVideo(String id, String name) { super(id, name); }
    public MediaVideo(String id, String name, String description) { super(id, name, description); }

    @Override
    public String toString() {
        return "{" +
                    "type: Video, " +
                    "data: " + super.toString() +
                "}";
    }
}
