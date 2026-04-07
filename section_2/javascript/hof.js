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

// let foo = function () {};

function callMe(foo) {
    foo();
}

// boo: true
// func1: some function taking no arguments
// func2: some function taking no arguments
function indirectIf(boo, func1, func2) {
    if (boo) {
        func1();
    } else {
        func2();
    }
}

function indirectWhile(condition, body) {
    if (condition()) {
        body();
        indirectWhile(condition, body);
    }
}

function debug(add) {
    // FOR NEXT TIME - go through it
    
