public class Main {
    // fn foo<A: Hash>(a: A) -> int {
    //   return a.hashCode();
    // }

    public static <A> int foo(Hash<A> hash, A a) {
        return hash.hashCode(a);
    }

    public static void main(String[] args) {
        // foo(Pair { first: 1, second: 2.2 })
        System.out.println(foo(PairIsHash.instance, new Pair(1, 2.2)));
    }
}
