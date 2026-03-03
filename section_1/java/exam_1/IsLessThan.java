public class IsLessThan implements Runner {
    public final int consArg;
    public IsLessThan(final int consArg) {
        this.consArg = consArg;
    }
    public boolean someMethod(final int methodArg) {
        return methodArg < consArg;
    }
}
