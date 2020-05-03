package gr.codehub.exercise.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediaManagement {
    private List<MediaFile> medias = new ArrayList<MediaFile>();

    public MediaManagement (){
        medias.add(new MediaImage("1","test_image","test image"));
        medias.add(new MediaAudio("2","test_audio","test audio"));
        medias.add(new MediaVideo("3","test_video","test video"));
    }


    public void add (MediaFile media){ medias.add(media); }

    public void remove (int index){
        if (index >= 0 && index < medias.size()) medias.remove(index);
    }
    public void remove (String name){
        for (MediaFile m: medias){
            if (m.getName() == name) medias.remove(m);
        }
    }

    public MediaFile search (int index){
        if (index >= 0 && index < medias.size()) return medias.get(index);
        return null;
    }
    public MediaFile search (String name){
        for (MediaFile m: medias){
            if (m.getName().equals(name)) return m;
        }
        return null;
    }

    public void save (){
        save("data.txt");
    }
    public void save (String filename){
        try {
            PrintWriter writter = new PrintWriter(new File(filename));
            writter.println(medias.toString());
            writter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void load (String filename){
        JSON

        try {
            Scanner scanner = new Scanner(new File(filename));

            String json = "[]";
            while (scanner.hasNextLine()) {
                json = scanner.nextLine();
            }
        } catch (Exception e){
            System.out.println("Error 404 ! File not Found.");
        }
    }

    @Override
    public String toString() {
        return "" + medias;
    }
}
