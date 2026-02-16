import java.io.IOException;

public interface Writer {
    public void write(String thingToWrite) throws IOException;
    public void close() throws IOException;
}
