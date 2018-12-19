class A {

    constructor(num1: number) {
        this.num_a = num1;
    }
    public num_a: number;
}


class B extends A {

    constructor(num1: number, num2:number) {
        super(num1);
        this.num_b = num2;
    }
    public num_b: number;
}



let a1: A;

a1 = new A(2);
a1 = new B(2,4);

console.log(a1.num_a);
if (a1 instanceof B) {

    // first way to down-casting
    console.log((<B>a1).num_b);


    // second way to down-casting
    console.log((a1 as B).num_b);
}



let b1: B;

//b1=new A();  //--> COMPILATION ERROR
b1 = new B(2,4);


console.log(b1.num_a);
console.log(b1.num_b);

