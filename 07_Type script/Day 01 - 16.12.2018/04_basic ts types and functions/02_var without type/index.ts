
/*********************************
 * VARIABELS
**********************************/

//---------------assign value in decleration line (gets the type of the value)----------------------
let a1=5;
//a1="test";  //COMPILATION ERROR -> Type '"test"' is not assignable to type 'number'
a1=6;


//---------------non assigned value in decleration line (gets `any` type)----------------------
let a2;
a2=5;
a2="test";


//---------------non assigned value in decleration line - but defined a type----------------------
let a3:number;
a3=5;
//a3="test"; //COMPILATION ERROR -> Type '"test"' is not assignable to type 'number'





/*********************************
 * FUNCTION
**********************************/

//func1(n1: any): string
function func1(n1){
    return "test";
}

//func2(n1: any): void
function func2(n1){
}




console.log(func1('3'));       //--> test
console.log(func2('3'));       //--> undefined