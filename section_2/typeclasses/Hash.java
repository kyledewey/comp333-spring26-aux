// trait Hash {
//   fn hashCode(&self) -> i32;
// }

// Self
public interface Hash<Self> {
    public int hashCode(Self self);
}
