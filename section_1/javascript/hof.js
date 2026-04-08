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

function delayedAdd(x) {
    return (y) => x + y;
}

function callMe(foo) {
    foo();
}

function indirectIf(bool, function1, function2) {
    if (bool) {
        function1();
    } else {
        function2();
    }
}

function indirectWhile(condition, body) {
    if (condition()) {
        body();
        indirectWhile(condition, body);
    }
}

function add(x, y) {
    // console.log("first param: " + x);
    // console.log("second param: " + y);
    let result = x + y;
    // console.log("return value: " + result);
    return result;
}

function sub(a, b) { return a - b; }

function debug(someFunc) {
    return (x, y) => {
        let returnValue = someFunc(x, y);
        console.log("first param: " + x);
        console.log("second param: " + y);
        console.log("return value: " + returnValue);
        // console.table({ x,
        //                 y,
        //                 returnValue });
        return returnValue;
    }        
}


// let withAdd = (addMethod, num) => (x, y) => addMethod(x, y) + num;

// addMethod: (int, int) => int
// num: int
function withAdd(addMethod, num) {
    // x and the num
    // return (x, y) => addMethod(x, y) + num;
    return function (x, y) {
        return addMethod(x, y) + num;
    };
}

