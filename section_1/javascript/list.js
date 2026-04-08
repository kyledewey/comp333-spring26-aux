// for elem in arr:
//   print(elem)

// public static void printAll(int[] arr) {
//   for (int elem : arr) { // for each loop
//     System.out.println(elem);
//   }
// }
function loop(arr, f) {
    for (let index = 0; index < arr.length; index++) {
        let elem = arr[index];
        f(elem);
    }
}

// for (...) {
//   if (...) {
