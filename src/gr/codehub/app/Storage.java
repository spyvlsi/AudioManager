package gr.codehub.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Storage {
    private ArrayList<media> mediaList = new ArrayList<>();

    public void addFile (media file) {
        mediaList.add(file);
    }

    public void removeFile (int position){
        if (position>=0 && position<= mediaList.size()){
            mediaList.remove(position);
        }
    }

    public void displayStorage (){
        if(mediaList.isEmpty()) {
            System.out.println("The storage is empty");
        }
        else{
                mediaList.forEach(System.out::println);
        }
    }

    public void clearStorage () {
        mediaList.clear();
    }

    public int filesSum() {
        return mediaList.size();
    }

    public float storageSize(){
        float totalSize = 0;
        totalSize = mediaList.stream().map(media -> media.getSize()).reduce(0.0f, (a,b) -> a+b);
        return (totalSize);
    }

    //search,sort
    public void sortByName (){
        mediaList.sort(Comparator.comparing(media::getFilename));
    }

    public void sortByType(){
        mediaList.sort(Comparator.comparing(media::getType));
    }

    public Storage searchByName(String filename){
        Storage stored = new Storage();
        mediaList.forEach(mediaFile -> {
            if (mediaFile.getFilename().equals(filename)) {
                stored.addFile(mediaFile);
            }
        });
        if (mediaList.isEmpty())
            return null;

        return stored;
    }



    public void saveStorage(String mediaCenter){
        try {
            PrintWriter printWriter = new PrintWriter(new File(mediaCenter));
            for(media p: mediaList){
                printWriter.println(p.getFilename() + "," + p.getDescription() + "," + p.getSize()
                        + "," + p.getType());
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void loadStorage(String mediaCenter){
        mediaList.clear();
        try {
            Scanner scanner = new Scanner(new File(mediaCenter));
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] words = line.split(",");
                media file = new media(
                        words[0],
                        words[1],
                        Float.parseFloat(words[2]),
                        words[3]);

                mediaList.add(file);
            }
        } catch (Exception e) {
        }
    }

}
