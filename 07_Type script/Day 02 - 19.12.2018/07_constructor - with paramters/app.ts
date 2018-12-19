class Dog {

    age: number;

    public constructor(age: number) {
        console.log("constructor is running");
        this.age = age;
    }

    public sayHello(): string {
        return `Hello I am ${this.age} years old`;
    }
}


let d1: Dog = new Dog(20);  //--> constructor is running
console.log(d1.sayHello())  //--> Hello I am 20 years old
