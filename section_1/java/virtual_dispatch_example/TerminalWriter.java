public class TerminalWriter implements Writer {
    public TerminalWriter() {}
    
    public void write(String thingToWrite) throws IOException {
        System.out.println(thingToWrite);
    }
    
    public void close() throws IOException {}
}

    
