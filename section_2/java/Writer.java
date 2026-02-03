import java.io.IOException;

public interface Writer {
    public void write(String toWrite) throws IOException;
    public void close() throws IOException;
}

