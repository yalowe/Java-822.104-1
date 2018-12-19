class Calc{
    static numOfOperations:number=0;

    static add(n1:number, n2:number):number{
        Calc.numOfOperations++;
        return n1+n2;
    }
}


console.log(Calc.numOfOperations);  //--> 0

console.log(Calc.add(2,4));         //--> 6
console.log(Calc.numOfOperations);  //--> 1

console.log(Calc.add(7,3));         //--> 10
console.log(Calc.numOfOperations);  //--> 2