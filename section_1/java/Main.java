import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Does some kind of computation.
// Output is written to a file or to the terminal,
// depending on a command-line argument.
public class Main {
    // Gives back name of the file to write to, or
    // null if we aren't writing to a file
    public static String getFileName(String[] args) {
        if (args.length >= 1) {
            return args[0];
        } else {
            return null;
        }
    }
    
    // Performs some kind of computation.
    public static int doComputation(Writer writer) throws IOException {
        int retval = 0;
        for (; retval < 10000; retval++) {
            if (retval % 100 == 0) {
                writer.write("STILL RUNNING: " + retval);
            }
        }
        return retval;
    }

    public static void main(String[] args) throws IOException {
        String fileName = getFileName(args);
        Writer myWriter = new Writer(fileName);
        int result = doComputation(myWriter);
        writer.write("" + result);
        writer.close();
    }
}

