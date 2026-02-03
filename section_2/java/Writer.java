import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class Writer {
    private FileWriter writer;

    public Writer(String fileName) throws IOException {
        if (fileName != null) {
            writer = new FileWriter(new File(fileName));
        } else {
            writer = null;
        }
    }

    public void write(String toWrite) throws IOException {
        if (writer == null) {
            // write to terminal
            System.out.println(toWrite);
        } else {
            // write to file
            writer.write(toWrite);
        }
    }

    public void close() throws IOException {
        if (writer != null) {
            writer.close();
        }
    }
}

