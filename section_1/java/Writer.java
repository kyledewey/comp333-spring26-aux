import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    private FileWriter writer = null;

    public Writer(String fileName) throws IOException {
        if (fileName != null) {
            writer = new FileWriter(new File(fileName));
        }
    }
        
    public void write(String thingToWrite) throws IOException {
        if (writer == null) {
            // write to terminal
            System.out.println(thingToWrite);
        } else {
            // write to a file
            // fileName is specifically the name of the file
            // to write to
            writer.write(thingToWrite);
        }
    }

    public void close() throws IOException {
        if (writer != null) {
            writer.close();
        }
    }
}
