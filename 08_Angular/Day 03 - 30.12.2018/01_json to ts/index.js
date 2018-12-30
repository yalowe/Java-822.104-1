var Movie2 = /** @class */ (function () {
    function Movie2() {
        this.movie_name = "Test";
    }
    Movie2.prototype.getInfo = function () {
        return "class: " + this.movie_name;
    };
    return Movie2;
}());
// JSON = java script object notation
var obj = {
    "id": 5,
    "movie_name": "Tower",
    "price": "8.47",
    "movie_date": "4/6/2017",
    "getInfo": function () {
        return "json: " + this.movie_name;
    }
};
//Movie1 is an interface - that can point to any object that implements all the requierd parts
var m1 = obj;
var m2 = obj;
var m3 = new Movie2();
console.log(m1); //--> { id: 5, movie_name: 'Tower', price: '8.47', movie_date: '4/6/2017' }
console.log(m2); //--> { id: 5, movie_name: 'Tower', price: '8.47', movie_date: '4/6/2017' }
console.log(m1.getInfo());
console.log(m2.getInfo());
console.log(m3.getInfo());
