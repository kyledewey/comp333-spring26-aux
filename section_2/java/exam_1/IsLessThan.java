public class IsLessThan implements Runner {
    private final int consParam;
    public IsLessThan(final int consParam) {
        this.consParam = consParam;
    }
    public boolean someMethod(final int methodParam) {
        return methodParam < consParam;
    }
}
