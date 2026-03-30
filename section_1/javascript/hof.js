// higher-order functions

// shouldPrint: function that takes an integer, gives
// back a boolean
function printSome(arr, shouldPrint) {
    for (let index = 0; index < arr.length; index++) {
        let element = arr[index];
        // shouldPrint(arr[index])
        // arr[index] > value
        if (shouldPrint(element)) {
            console.log(element);
        }
    }
}

function printAll(arr) {
    printSome(arr, (e) => true);
}

function printGreaterThan(arr, value) {
    // printSome(arr, (e) => e > value);
    printSome(arr,
              function (e) {
                  return e > value;
              });
}

function printLessThan(arr, value) {
    printSome(arr, (e) => e < value);
}

function printLessThanFive(arr) {
    printLessThan(arr, 5);
}
    
function printLessThanTen(arr) {
    printLessThan(arr, 10);
}

// function printGreaterOrLessThan(arr, value, isGreaterThan) {
//     for (let index = 0; index < arr.length; index++) {
//         let element = arr[index];
//         if (isGreaterThan && element > value) {
//             console.log(element);
//         } else if (!isGreaterThan && element < value) {
//             console.log(element);
//         }
//     }
// }

