public class Types {
    public static int add(int x, int y) {
        return x + y;
    }
    public static String add(String x, String y) {
        return x + y;
    }
    public static double add(double x, double y) {
        return x + y;
    }

    public interface Base {}
    public class MyInt implements Base {
        public final int value;
        public MyInt(final int value) { this.value = value; }
    }
    public class MyString implements Base {
        public final String value;
        public MyString(final String value) { this.value = value; }
    }
    public static Base doSomething(int a) {
        if (a < 3) {
            return new MyInt(0);
        } else {
            return new MyString("foo");
        }
    }   
}
