public interface ImmutableList {
    public int length();
    public int sum(); // empty list sum is defined as 0
    public boolean contains(final int value);
    public ImmutableList append(final ImmutableList other);

    public boolean isEmpty();

    // [1, 2, 3].addAmount(3) ==> [4, 5, 6]
    //
    // [3, 1].addAmount(2) ==> [5, 3]
    //   new Cons(3, new Cons(1, new Nil())).addAmount(2) ==>
    //      new Cons(5, new Cons(3, new Nil()))
    //
    // [].addAmount(5) ==> []
    public ImmutableList addAmount(int amount);
    
    // Defined for you
    public boolean equals(final Object other);
    public String toString();
    public int hashCode();
} // ImmutableList
