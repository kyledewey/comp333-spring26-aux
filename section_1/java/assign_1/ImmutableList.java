public interface ImmutableList {
    public int length();
    public int sum(); // empty list sum is defined as 0
    public boolean contains(final int value);
    public ImmutableList append(final ImmutableList other);

    public boolean isEmpty();

    // [3, 2, 4].addAmount(1) ==> [4, 3, 5]
    // [2].addAmount(5) ==> [7]
    // [].addAmount(7) ==> []
    public ImmutableList addAmount(final int amount);
    
    public String toString();
    public int hashCode();
    public boolean equals(final Object other);
} // ImmutableList
