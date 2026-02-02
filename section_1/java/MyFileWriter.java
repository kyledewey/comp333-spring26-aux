import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter implements Writer {
    private final FileWriter writer;

    public MyFileWriter(String fileName) throws IOException {
        writer = new FileWriter(new File(fileName));
    }
        
    public void write(String thingToWrite) throws IOException {
        // write to a file
        // fileName is specifically the name of the file
        // to write to
        writer.write(thingToWrite);
    }

    public void close() throws IOException {
        writer.close();
    }
}
