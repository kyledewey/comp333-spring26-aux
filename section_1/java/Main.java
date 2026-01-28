import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Does some kind of computation.
// Output is written to a file or to the terminal,
// depending on a command-line argument.
public class Main {
    // Performs some kind of computation.
    public static int doComputation() { return 42; }

    // Gives back name of the file to write to, or
    // null if we aren't writing to a file
    public static String getFileName(String[] args) {
        if (args.length >= 1) {
            return args[0];
        } else {
            return null;
        }
    }
    
    public static void main(String[] args) throws IOException {
        String fileName = getFileName(args);
        int result = doComputation();
        if (fileName == null) {
            // write to terminal
            System.out.println(fileName);
        } else {
            // write to a file
            // fileName is specifically the name of the file
            // to write to
            FileWriter writer = new FileWriter(new File(fileName));
            writer.write("" + result);
            writer.close();
        }
    }
}

