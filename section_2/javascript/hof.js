// operation: function that takes an int, returns a boolean
function printSome(arr, operation) {
    for (let index = 0; index < arr.length; index++) {
        let elem = arr[index];
        if (operation(elem)) {
            console.log(elem);
        }
    }
}

function printAll(arr) {
    printSome(arr, (e) => true);
}

function printGreaterThan(arr, value) {
    // printSome(arr, (e) => e > value);
    printSome(arr,
              function (e) { // operation(elem)
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

