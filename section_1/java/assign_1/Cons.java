public class Cons implements ImmutableList {
    // ---BEGIN INSTANCE VARIABLES---
    public final int head;
    public final ImmutableList tail;
    // ---END INSTANCE VARIABLES---

    public Cons(final int head, final ImmutableList tail) {
        this.head = head;
        this.tail = tail;
    } // Cons

    public boolean equals(final Object other) {
        if (other instanceof Cons) {
            final Cons otherCons = (Cons)other;
            return head == otherCons.head && tail.equals(otherCons.tail);
        } else {
            return false;
        }
    } // equals
    
    public String toString() {
        return "Cons(" + head + ", " + tail.toString() + ")";
    } // toString

    public int hashCode() {
        return sum();
    } // hashCode

    // [4, 2, 7].length() ==> 3
    // head: 4
    // tail: [2, 7]
    // this: [4, 2, 7]
    // expected result: 3
    public int length() {
        // must be recursive - Cons is recursive at the data level
        //
        // [2, 7].length() ==> 2
        // rest: 2
        int rest = tail.length();
        return rest + 1;
        // NEXT TIME: isEmpty, addAmount
    }
    
    public int sum() {
        return -1;
    }
    public boolean contains(final int value) {
        return true;
    }
    public ImmutableList append(final ImmutableList other) {
        return null;
    }

    public boolean isEmpty() {
        return false;
    }

    // [3, 2, 4].addAmount(1) ==> [4, 3, 5]
    public ImmutableList addAmount(final int amount) {
        // head: 3
        // tail: [2, 4]
        // amount: 1
        // this: [3, 2, 4] (started with)

        ImmutableList rest = tail.addAmount(amount);
        //                   [2, 4].addAmount(1)
        // rest:        [3, 5]
        // expected: [4, 3, 5]
        return new Cons(head + amount, rest);

        //return new Cons(head + amount, tail.addAmount(amount));
    }

} // Cons
