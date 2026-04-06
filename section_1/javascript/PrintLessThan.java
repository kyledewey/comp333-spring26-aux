public class PrintLessThan implements Function {
    public final int value;
    public PrintLessThan(final int value) {
        this.value = value;
    }
    public boolean call(final int e) {
        return e < value;
    }
}

