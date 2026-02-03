import java.io.IOException;

// Does some sort of computation
// Output will be printed either to the terminal,
// or to a provided file (as a command-line argument).
public class Main {
    // Gives back name of file to write to, or null
    // if we are to write to the terminal
    public static String getFileName(String[] args) {
        if (args.length > 0) {
            return args[0];
        } else {
            return null;
        }
    }

    public static int doComputation(Writer writer) throws IOException {
        int retval = 0;
        for (; retval < 10000; retval++) {
            if (retval % 100 == 0) {
                writer.write("STILL RUNNING");
            }
        }
        return retval;
    }

    public static void main(String[] args) throws IOException {
        String fileName = getFileName(args);
        Writer writer;
        if (fileName == null) {
            writer = new TerminalWriter();
        } else {
            writer = new MyFileWriter(fileName);
        }
        int result = doComputation(writer);
        writer.write("" + result);
        writer.close();
    }
}
    
