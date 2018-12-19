class Person{
    public name:String;
    public age:number;
}

let p1:Person=new Person();
p1.age=20;
p1.name="Alice";


let p2:Person=new Person();
p2.age=35;
p2.name="Bob";

let arr:Person[]=[p1,p2];


for(let x of arr){
    console.log(x.name,x.age);
}


/*
OUTPUT:
_______________________
Alice 20
Bob 35
*/