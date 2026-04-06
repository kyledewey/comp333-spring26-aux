public class PrintSome {
    public static void printSome(int[] arr,
                                 Function shouldPrint) {
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (shouldPrint.call(element)) {
                System.out.println(element);
            }
        }
    }

    // function printAll(arr) {
    //   printSome(arr, (e) => true);
    // }
    public void printAll(int[] arr) {
        printSome(arr, new PrintAll());
        // printSome(arr, (int x) -> true);
    }

    public void printLessThan(int[] arr, int value) {
        printSome(arr, new PrintLessThan(value));
    }
}
