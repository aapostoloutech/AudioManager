package gr.codehub.exercise.app;

public class MediaAudio extends MediaFile {

    public MediaAudio() {}
    public MediaAudio(String id, String name) { super(id, name); }
    public MediaAudio(String id, String name, String description) { super(id, name, description); }

    @Override
    public String toString() {
        return "{" +
                    "type: Audio, " +
                    "data: " + super.toString() +
                "}";
    }
}
