function forEach(arr, f) {
    for (let index = 0; index < arr.length; index++) {
        let elem = arr[index];
        f(elem);
    }
}
function printAll(arr) {
    forEach(arr, (elem) => console.log(elem));
}
function printSome(arr, shouldPrint) {
    forEach(arr,
            function (element) {
                if (shouldPrint(element)) {
                    console.log(element);
                }
            });
}

// param1: an array of values
// param2: a function
//         -Takes the current accumulator
//         -Takes the current element in the array
//         Returns the new value of the accumulator
// param3: starting value
function reduce(arr, func, startingValue) {
    let accumulator = startingValue;
    for (let index = 0; index < arr.length; index++) {
        let elem = arr[index];
        accumulator = func(accumulator, elem);
    }
    return accumulator;
}

function product(arr) {
    return reduce(arr, (a, e) => a * e, 1);
    // let retval = 1; // accumulator
    // for (let index = 0; index < arr.length; index++) {
    //     let elem = arr[index];
    //     retval = retval * elem;
    // }
    // return retval;
}
function sum(arr) {
    return reduce(arr, (a, e) => a + e, 0);
    // let retval = 0;
    // for (let index = 0; index < arr.length; index++) {
    //     let elem = arr[index];
    //     retval = retval + elem;
    // }
    // return retval;
}

function findMin(arr) {
    let smallestSoFar = 0;
    for (let index = 0; index < arr.length; index++) {
        let elem = arr[index];
        if (elem < smallestSoFar) {
            smallestSoFar = elem;
        }
    }
    return smallestSoFar;
}

function min(a, b) {
    if (a < b) {
        return a;
    } else {
        return b;
    }
}
