// FOR MONDAY: Inheritance
function makeRectangle(w, h) {
    return { 'width': w, 'height': h };
}

let rectanglePrototype = {
    'getArea': function() {
        // `this` is a reference to whatever the method
        // was called on
        return this.width * this.height;
    },
    'getWidth': function() {
        return this.width;
    }
};

// constructor
function Rectangle(w, h) {
    // this = {}
    this.width = w;
    this.height = h;
    this.__proto__ = rectanglePrototype;
    // return this;
}
