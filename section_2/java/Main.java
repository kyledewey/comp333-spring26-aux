import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

// Does some sort of computation
// Output will be printed either to the terminal,
// or to a provided file (as a command-line argument).
public class Main {
    public static int doComputation() { return 42; }

    // Gives back name of file to write to, or null
    // if we are to write to the terminal
    public static String getFileName(String[] args) {
        if (args.length > 0) {
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
            System.out.println(result);
        } else {
            // write to file
            FileWriter writer = new FileWriter(new File(fileName));
            writer.write("" + result);
            writer.close();
        }
    }
}
    
