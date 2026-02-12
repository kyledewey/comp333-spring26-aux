// FOR MONDAY: go over alternative solutions
public class Main {
    public static boolean randomBoolean() { return false; }
    
    public static void main(String[] args) {
        Conditional c = (randomBoolean()) ? new FooThing() : new BarThing();
        c.operation();
    }
}
