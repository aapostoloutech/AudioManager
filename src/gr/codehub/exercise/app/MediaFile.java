package gr.codehub.exercise.app;

import java.util.Scanner;

public abstract class MediaFile {
    private String id;
    private String name;
    private String description = "";

    public MediaFile() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter id: ");
        this.id = scanner.next();
        System.out.println("Enter name: ");
        this.name = scanner.next();
        System.out.println("Enter description: ");
        this.description = scanner.next();
    }
    public MediaFile(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public MediaFile(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {  return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    @Override
    public String toString() {
        return "{" +
                "id:'" + id + '\'' +
                ", name:'" + name + '\'' +
                ", description:'" + description + '\'' +
                '}';
    }
}
