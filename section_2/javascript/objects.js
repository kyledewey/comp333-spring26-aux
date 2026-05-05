// NEXT TIME: inheritance
function add(x, y) {
    temp = x + y;
    return temp;
}

function makeRectangle(w, h) {
    // this = {};
    return { 'width': w, 'height': h };
}

let rectanglePrototype = {
    'getArea': function() {
        return this.width * this.height;
    },
    'getWidth': function() {
        return this.width;
    }
};

// constructor
function Rectangle(w, h) {
    // this = {};
    this.width = w;
    this.height = h;
    this.__proto__ = rectanglePrototype;
    // return this;
}
