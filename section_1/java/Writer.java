public class Writer {
    private FileWriter writer = null;

    public Writer(String fileName) {
        if (fileName != null) {
            writer = new FileWriter(new File(fileName));
        }
    }
        
    public void write(String thingToWrite) throws IOException {
        if (fileName == null) {
            // write to terminal
            System.out.println(thingToWrite);
        } else {
            // write to a file
            // fileName is specifically the name of the file
            // to write to
            writer.write(thingToWrite);
        }
    }

    public void close() {
        if (writer != null) {
            writer.close();
        }
    }
}
