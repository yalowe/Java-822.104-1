enum Color{
    Black,
    Green,
    Blue
}

console.log(Color[0]);  //--> Black
console.log(Color[1]);  //--> Green
console.log(Color[2]);  //--> Blue

let c1:Color=Color.Blue;


console.log(c1);        //--> 2
console.log(Color[c1]); //--> Blue

