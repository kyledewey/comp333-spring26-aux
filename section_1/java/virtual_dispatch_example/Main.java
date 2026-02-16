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
            // Writer = TerminalWriter; subtyping polymorphism
            myWriter = new TerminalWriter();
        } else {
            // Writer = MyFileWriter; subtyping polymorphism
            myWriter = new MyFileWriter(fileName);
        }
        int result = doComputation(myWriter);

        // myWriter compile-time type: Writer
        //   When code is compiled (javac)
        // myWriter runtime type: TerminalWriter OR MyFileWriter
        //   When code is run (java)

        // O(1)
        // if (myWriter instanceof TerminalWriter) {
        //   TerminalWriter.write(...);
        // } else if (myWriter instanceof MyFileWriter) {
        //   MyFileWriter.write(...);
        // } else if (...) {
        //   ...
        // } else if (...) {
        //   ...
        // }

        // ad-hoc polymorphism: exactly which write is called is
        // based on the runtime type of myWriter
        myWriter.write("" + result);
        myWriter.close();
    }

    // System.out.println() // println()
    // System.out.println(5) // println(int)
    // System.out.println(3.14) // println(double)
    // System.out.println("foo")

    // FOR NEXT TIME: get into handout
}

