import java.io.IOException;

public class TerminalWriter implements Writer {
    public TerminalWriter() {}
    public void write(String toWrite) throws IOException {
        System.out.println(toWrite);
    }
    public void close() throws IOException {}
}    
