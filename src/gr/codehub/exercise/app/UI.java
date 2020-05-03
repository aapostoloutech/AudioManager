package gr.codehub.exercise.app;

import javax.print.attribute.standard.Media;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UI {
    private MediaManagement manager = new MediaManagement();

    public UI (MediaManagement manager){
        this.manager = manager;
    }

    public void run (){
        Choice choice;
        do {
            switch (choice = menu()){
                case ADD:
                    addFile();
                    manager.save();
                    break;
                case REMOVE:
                    removeFile();
                    manager.save();
                    break;
                case UPDATE:
                    updateFile();
                    manager.save();
                    break;
                case DISPLAY:
                    System.out.println(manager.toString());
                    break;
                case ERROR:
                default:
                    System.out.println("There was an error, please try again.");
            }

        } while (choice != Choice.EXIT);
    }

    private Choice menu (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n" +
            "1. ADD File.\n" +
            "2. REMOVE File.\n" +
            "3. DISPLAY Files.\n" +
            "4. UPDATE File.\n" +
            "5. SAVE Files.\n" +
            "0. EXIT.\n"
         );

        switch (scanner.nextInt()){
            case 1: return Choice.ADD;
            case 2: return Choice.REMOVE;
            case 3: return Choice.DISPLAY;
            case 4: return Choice.UPDATE;
            case 5: return Choice.SAVE;
            case 0: return Choice.EXIT;

            default: return Choice.ERROR;
        }
    }

    private void addFile (){
        Scanner scanner = new Scanner(System.in);

        System.out.println(
            "1. IMAGE.\n" +
            "2. AUDIO.\n" +
            "3. VIDEO.\n"
        );
        switch (scanner.nextInt()){
            case 1:
                manager.add(new MediaImage());
                return;
            case 2:
                manager.add(new MediaAudio());
                return;
            case 3:
                manager.add(new MediaVideo());
                return;
            default: System.out.println("There was an error, please try again");
                return;
        }
    }

    private void removeFile (){
        Scanner scanner = new Scanner(System.in);

        System.out.println(
            "Delete by:\n" +
            " 1. name\n" +
            " 2. index"
        );
        switch (scanner.nextInt()){
            case 1:
                System.out.println("Give name");
                manager.remove(scanner.next());
                break;
            case 2:
                System.out.println("Give index");
                manager.remove(scanner.nextInt());
                break;
            default: System.out.println("There was an error, please try again");
        }
    }

    private void updateFile (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 'name' of file to UPDATE");
        String name = scanner.next();
        if (manager.search(name) == null) return;

        System.out.println("Enter new 'description");
        manager.search(name).setDescription(scanner.next());
    }
}
