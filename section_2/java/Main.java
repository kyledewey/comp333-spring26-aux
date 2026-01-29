import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

// Does some sort of computation
// Output will be printed either to the terminal,
// or to a provided file (as a command-line argument).
public class Main {
    public static void write(String fileName, String toWrite) throws IOException {
        if (fileName == null) {
            // write to terminal
            System.out.println(toWrite);
        } else {
            // write to file
            // TODO: need to not clobber file
            FileWriter writer = new FileWriter(new File(fileName));
            writer.write(toWrite);
            writer.close();
        }
    }
        
    public static int doComputation(String fileName) throws IOException {
        int retval = 0;
        for (; retval < 10000; retval++) {
            if (retval % 100 == 0) {
                write(fileName, toWrite);
            }
        }
        return retval;
    }

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
        int result = doComputation(fileName);
        write(fileName, "" + result);
    }
}
    
