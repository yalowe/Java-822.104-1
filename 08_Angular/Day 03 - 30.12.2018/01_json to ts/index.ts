
interface Movie1 {
    id: number;
    movie_name: string;
    price: string;
    movie_date?: string;
    getInfo(): string;
}


class Movie2 {
    id: number;
    movie_name: string = "Test";
    price: string;
    movie_date: string;

    public getInfo(): string {
        return `class: ${this.movie_name}`;
    }
}


// JSON = java script object notation
let obj = {
    "id": 5,
    "movie_name": "Tower",
    "price": "8.47",
    "movie_date": "4/6/2017",
    "getInfo": function () {
        return `json: ${this.movie_name}`;
    }
};


//Movie1 is an interface - that can point to any object that implements all the requierd parts
let m1: Movie1 = obj;

let m2: Movie2 = obj;
let m3: Movie2 = new Movie2();

console.log(m1);  //--> { id: 5, movie_name: 'Tower', price: '8.47', movie_date: '4/6/2017' }
console.log(m2);  //--> { id: 5, movie_name: 'Tower', price: '8.47', movie_date: '4/6/2017' }

console.log(m1.getInfo()); //--> json: Tower
console.log(m2.getInfo()); //--> json: Tower
console.log(m3.getInfo()); //--> class: Test