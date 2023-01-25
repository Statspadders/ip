import java.util.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Duke {
    private Ui ui;
    private Storage storage;
    private TaskList tasks;
    private Parser parser;

    public Duke(String filepath) {
        ui = new Ui();
        storage = new Storage(filepath);
        parser = new Parser();
        try {
            tasks = new TaskList(storage.load());
        }catch (IOException e) {
            ui.showLoadingError();
            tasks = new TaskList();
        }
    }
    public void run() {
        boolean isExit = false;
        while (!isExit) {
            try {
                String fullcommand = ui.readCommand();
                Command c = parser.parse(fullcommand,ui);
                c.execute(tasks,ui,storage);
                isExit = c.isExit();
            } catch (IOException | NullPointerException e) {

            }
        }
    }
    public static void main(String[] args){
        new Duke("data/duke.txt").run();
    }

    //Error Checking Methods
    public static boolean empty(String value) {
        if(value == null) {
            return true;
        }
        return false;
    }
}
