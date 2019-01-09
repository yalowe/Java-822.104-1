class Aniaml {
    name: string = "Alice";
}

class Person {
    name: string = "Bob";
    toString(): string {
        return "My name is: " + this.name;
    }
}

let x1: number = 7;
let x2: boolean = true;
let x3: string = "Bob";
let x4: string[] = ["test", "the", "ts"];
let x5: any = { "name": "Bob" };
let x6: Person = new Person();
let x7: Aniaml = new Aniaml();

console.log(x1.toString());  //--> 7
console.log(x2.toString());  //--> true
console.log(x3.toString());  //--> Bob
console.log(x4.toString());  //--> test,the,ts
console.log(x5.toString());  //--> [object Object]
console.log(x6.toString());  //--> My name is: Bob
console.log(x7.toString());  //--> [object Object]


console.log(x1 + "");  //--> 7
console.log(x2 + "");  //--> true
console.log(x3 + "");  //--> Bob
console.log(x4 + "");  //--> test,the,ts
console.log(x5 + "");  //--> [object Object]
console.log(x6 + "");  //--> My name is: Bob
console.log(x7 + "");  //--> [object Object]
