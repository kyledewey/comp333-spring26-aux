public class GreaterThanValueOp implements Op {
    public final int value;
    public GreaterThanValueOp(final int value) {
        this.value = value;
    }
    public boolean shouldPrint(final int e) {
        return e > value;
    }
}
