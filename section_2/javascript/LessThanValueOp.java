public class LessThanValueOp implements Op {
    public final int value;
    public LessThanValueOp(final int value) {
        this.value = value;
    }
    public boolean shouldPrint(final int e) {
        return e < value;
    }
}
