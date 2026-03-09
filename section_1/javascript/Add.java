public class Add {
    // Overloading - form of ad-hoc polymorphism
    // add(3, 2) // int add
    // add("foo", "bar") // String add    
    public static int add(int x, int y) {
        return x + y;
    }
    public static String add(String x, String y) {
        return x + y;
    }

    public static (Integer | String) doSomething(int x) {
        if (x < 3) {
            return 7;
        } else {
            return "foo";
        }
    }   
}

