package gr.codehub.app;

import java.util.Scanner;

public class Ui {

    public ActionMenu menu() {
        System.out.println("1. Add a file to Storage   2. Remove a file" +
                "    3. Display Storage     4.  Clear Storage  5. Total files" +
                " 6. Load Storage 7.Save 8. Search by name  " + " 9. Sort by name 10. Sort by file " +
                " 11. Total Size  0. Exit");

        int option;
        Scanner scanner = new Scanner(System.in);
        try {
            option = scanner.nextInt();
            switch (option) {
                case 1: return ActionMenu.ADD;
                case 2: return ActionMenu.REMOVE;
                case 3: return ActionMenu.DISPLAY;
                case 4: return ActionMenu.CLEAR;
                case 5: return ActionMenu.TOTALFILES;
                case 6: return ActionMenu.LOAD;
                case 7: return ActionMenu.SAVE;
                case 8: return ActionMenu.SEARCH_BY_NAME;
                case 9: return ActionMenu.SORT_BY_NAME;
                case 10: return ActionMenu.SORT_BY_TYPE;
                case 11: return ActionMenu.TOTALSIZE;
                case 0: return ActionMenu.EXIT;
                default:return ActionMenu.ERROR;
            }
        } catch (Exception e) {
            return ActionMenu.ERROR;
        }
    }
        public media createFile() {
            String filename;
            String description;
            float size;
            String type;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Give the filename ");
            filename = scanner.next();
            System.out.println("Give a description ");
            description = scanner.next();
            System.out.println("Give the file size ");
            size = scanner.nextFloat();
            System.out.println("Give the file type ");
            type = scanner.next();

            media file = new media(filename, description, size, type);

            return file;
        }

        public void manageStorage(Storage storage){

            ActionMenu choice;
            do {
                choice =  menu();

                switch (choice) {
                    case ADD:
                        media file =  createFile();
                        storage.addFile(file);
                        break;
                    case REMOVE:
                        System.out.println("Give an index to remove");
                        Scanner scanner = new Scanner(System.in);
                        int index= scanner.nextInt();
                        storage.removeFile(index);
                        break;
                    case DISPLAY:
                        storage.displayStorage();
                        break;
                    case CLEAR:
                        storage.clearStorage();
                        break;
                    case TOTALFILES:
                        System.out.println("TotalFiles= " + storage.filesSum());
                        break;
                    case EXIT:
                        break;
                    case SAVE:
                        storage.saveStorage("mediaCenter.txt");
                        break;
                    case LOAD:
                        storage.loadStorage("mediaCenter.txt");
                        break;
                    case ERROR:
                        System.out.println("You gave erroneous input");
                        break;
                    case SEARCH_BY_NAME:
                        scanner = new Scanner(System.in);
                        System.out.println("Search file by name: ");
                        String input = scanner.next();
                        Storage existed = storage.searchByName(input);
                        if (existed == null)
                            System.out.println("No file found!");
                        else
                            existed.displayStorage();
                        break;
                    case SORT_BY_NAME:
                        storage.sortByName();
                        storage.displayStorage();
                        break;
                    case SORT_BY_TYPE:
                        storage.sortByType();
                        storage.displayStorage();
                        break;
                    case TOTALSIZE:
                        System.out.println("Total size is: " + storage.storageSize());
                }
            }while(choice!=ActionMenu.EXIT);

        }

}
