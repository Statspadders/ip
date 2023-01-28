package duke;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Ui class that handles the User interface, that the user sees.
 */
public class Ui {
    public Ui() {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";

        System.out.println(logo);
        System.out.println("Hello! I'm Duke");
        System.out.println("What can I do for you?");
    }

    public void customMessage(String message) {
        System.out.println(message);
    }
    public void customMessage(Task value) {
        System.out.println(value);
    }

    public String readCommand() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String value = br.readLine();
        return value;
    }
    public void showMarkSucess(Task value) {
        System.out.println("Nice! I've marked this task as done: [X]" + value);
    }

    public void showNumberOfListings(int index) {
        System.out.println("Now you have " + index + " tasks in the list");
    }

    public void showCommandNotFound() {
        System.out.println("☹ OOPS!!! I'm sorry, but I don't know what that means :-(");
    }
    public void showLoadingError() {
        System.out.println("Oh no ! An error has occured");
    }

    public void showError(int error) {
        if (error == 1) {
            System.out.println("Missing input or input is of wrong type");
        }
    }

    public void byeMessage() {
        System.out.println("Bye. Hope to see you again soon!");
    }

    public void printList(List<Task> list) {
        for (int i = 0; i < list.size(); i++) {
            int j = i + 1;
            System.out.println(j + "." + list.get(i));
        }
    }
}
