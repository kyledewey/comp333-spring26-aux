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
            // Writer = TerminalWriter // subtyping polymorphism
            writer = new TerminalWriter();
        } else {
            // Writer = MyFileWriter // subtyping polymorphism
            writer = new MyFileWriter(fileName);
        }
        int result = doComputation(writer);
        writer.write("" + result); // ad-hoc polymorphism: actual method called is determined at runtime based on the runtime type of writer
        writer.close();

        // FOR NEXT TIME: recap subtyping / ad-hoc, get into handout
    }
}
    
