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

    // [1, 2, 3].length()
    //   head: 1
    //   tail: [2, 3]
    //   this: [1, 2, 3]
    //   expected result: 3
    public int length() {
        // What is the recursive call?
        // What do I make the recursive call on?

        //         [2, 3].length()
        int rest = tail.length();
        // rest: 2

        return rest + 1;
    }
    // NEXT TIME: go through length on board and show why it works,
    //            addAmount example
    
    public int sum() {
        return -1;
    }
    public boolean contains(final int value) {
        return false;
    }
    public ImmutableList append(final ImmutableList other) {
        return null;
    }

    public boolean isEmpty() {
        return false;
    }
} // Cons
