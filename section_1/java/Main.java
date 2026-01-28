import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Does some kind of computation.
// Output is written to a file or to the terminal,
// depending on a command-line argument.
public class Main {
    public static void write(String fileName,
                             String thingToWrite) throws IOException {
        if (fileName == null) {
            // write to terminal
            System.out.println(thingToWrite);
        } else {
            // write to a file
            // fileName is specifically the name of the file
            // to write to
            //
            // Issue: we can't just remake the writer, or we will
            // clobber the original file
            FileWriter writer = new FileWriter(new File(fileName));
            writer.write(thingToWrite);
            writer.close();
        }
    }

    // Issue: Need to pass fileName through everything
    // Issue: Creating Writer every time
    
    // Performs some kind of computation.
    public static int doComputation(String fileName) throws IOException {
        int retval = 0;
        for (; retval < 10000; retval++) {
            if (retval % 100 == 0) {
                write(fileName, "STILL RUNNING: " + retval);
            }
        }
        return retval;
    }

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
        int result = doComputation(fileName);
        write(fileName, "" + result);
    }
}

