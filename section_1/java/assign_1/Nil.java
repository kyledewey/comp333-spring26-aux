public class Nil implements ImmutableList {
    public Nil() {}

    public boolean equals(final Object other) {
        return other instanceof Nil;
    } // equals
    
    public String toString() {
        return "Nil";
    } // toString

    public int hashCode() {
        return 0;
    } // hashCode

    public int length() {
        return -1;
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
} // Nil
    
