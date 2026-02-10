// impl Hash for Pair {
//   fn hashCode(&self) -> i32 {
//     return self.first + 
public class PairIsHash implements Hash<Pair> {
    public static final PairIsHash instance = new PairIsHash();
    public int hashCode(Pair self) {
        return self.first + (int)self.second;
    }
}
