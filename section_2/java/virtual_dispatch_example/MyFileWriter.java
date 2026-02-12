import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class MyFileWriter implements Writer {
    private final FileWriter writer;

    public MyFileWriter(String fileName) throws IOException {
        writer = new FileWriter(new File(fileName));
    }

    public void write(String toWrite) throws IOException {
        writer.write(toWrite);
    }
        
    public void close() throws IOException {
        writer.close();
    }
}

