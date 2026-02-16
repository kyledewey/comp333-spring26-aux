public class Main {
    public static boolean randomBoolean() { ... }
    public static void main(String[] args) {
        Conditional c = (randomBoolean()) ? new IfTrue() : new FalseConditional();
        c.operation();
    }
}
