package gr.codehub.app;

public class Main {
    public static void main(String[] args){
        Ui ui = new Ui();
        Storage storage = new Storage();
        ui.manageStorage(storage);
    }
}
