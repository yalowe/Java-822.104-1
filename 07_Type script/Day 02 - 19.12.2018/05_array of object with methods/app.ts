class Person{
    public name:String;
    public age:number;

    public sayHello():string{
        return `Hello I am ${this.name} and my age is: ${this.age}`;
    }

}

let p1:Person=new Person();
p1.age=20;
p1.name="Alice";


let p2:Person=new Person();
p2.age=35;
p2.name="Bob";

let arr:Person[]=[p1,p2];


for(let x of arr){
    console.log(x.sayHello());
}


/*
OUTPUT:
_______________________
Hello I am Alice and my age is: 20
Hello I am Bob and my age is: 35
*/