public class Uninitialized {
    public static boolean foo() {
        return 2 < 3;
    }
    
    public static void main(String[] args) {
        int x;
        if (foo()) {
            x = 3;
        }
        System.out.println(x);
    }
}
