public class Hof {
    public static void printSome(int[] arr, Op operation) {
        for (int index = 0; index < arr.length; index++) {
            int elem = arr[index];
            if (operation.shouldPrint(elem)) {
                console.log(elem);
            }
        }
    }
    public static void printGreaterThan(int[] arr, int value) {
        // printSome(arr, (e) => e > value);
        printSome(arr, new GreaterThanValueOp(value));
    }
    public static void printLessThan(int[] arr, int value) {
        printSome(arr, new LessThanValueOp(value));
    }
}
        
