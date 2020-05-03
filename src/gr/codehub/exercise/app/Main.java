package gr.codehub.exercise.app;

public class Main {
    public static void main(String[] args) {
        MediaManagement manager = new MediaManagement();
        UI ui = new UI(manager);

        ui.run();
    }
}
