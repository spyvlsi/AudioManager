package gr.codehub.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Storage {
    private ArrayList<media> files = new ArrayList<>();

    public void addFile (media file) {
        files.add(file);
    }

    public void removeFile (int position){
        if (position>=0 && position<= files.size()){
            files.remove(position);
        }
    }

    public void displayStorage (){
        files.forEach(System.out::println);
    }

    public void clearStorage () {
        files.clear();
    }

    public int filesSum() {
        int sum = 0;
        for(media p : files){
            sum++;
        }
        return(sum);
    }

    public void saveStorage(String mediaCenter){
        try {
            PrintWriter printWriter = new PrintWriter(new File(mediaCenter));
            for(media p: files){
                printWriter.println(p.getFilename() + "," + p.getDescription() + "," + p.getSize()
                        + "," + p.getType());
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void loadStorage(String mediaCenter){
        files.clear();
        try {
            Scanner scanner = new Scanner(new File(mediaCenter));
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] words = line.split(",");
                media customer = new media(
                        words[0],
                        words[1],
                        words[2],
                        words[3]);

                files.add(customer);
            }
        } catch (Exception e) {
        }
    }
}
