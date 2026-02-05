import java.io.IOException;

public class TerminalWriter implements Writer {
    public TerminalWriter() {}
    @Override
    public void write(String toWrite) throws IOException {
        System.out.println(toWrite);
    }
    @Override
    public void close() throws IOException {}
}    
