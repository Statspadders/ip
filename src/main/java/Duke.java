import java.util.*;
import java.io.*;
public class Duke {
    public static void main(String[] args) throws IOException {
        /* String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n"; */
        System.out.println("Hello! I'm Duke");
        System.out.println("What can I do for you?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = "";
        while( (text = br.readLine()) != "bye") {
            System.out.println(text);
        }
        System.out.println("Bye. Hope to see you again soon!");


    }
}
