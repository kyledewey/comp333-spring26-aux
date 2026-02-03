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

    public static void example() throws IOException {
        Writer writesToFoo = new MyFileWriter("foo.txt");
        Writer writesToBar = new MyFileWriter("bar.txt");
        Writer writesToTerminal = new TerminalWriter(null);

        writesToFoo.write("hello");
        writesToBar.write("goodbye");
        writesToTerminal.write("something on terminal");
        writesToFoo.close();
        writesToBar.close();
        writesToTerminal.close();
    }
    
    public static void main(String[] args) throws IOException {
        // example();
        String fileName = getFileName(args);
        Writer myWriter;
        if (fileName == null) {
            myWriter = new TerminalWriter();
        } else {
            myWriter = new MyFileWriter(fileName);
        }
        int result = doComputation(myWriter);
        myWriter.write("" + result);
        myWriter.close();

        // FOR NEXT TIME: show subtyping / ad-hoc polymorphism, show handout
    }
}

