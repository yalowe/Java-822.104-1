class Dog{
    public age:number;

    public sayHello():string{
        return `Hello I am ${this.age} years old`;
    }
}


let d1:Dog;
d1=new Dog();
d1.age=12;

console.log(d1.sayHello());  //--> Hello I am 12 years old


let d2:Dog=new Dog();
d2.age=10;

console.log(d2.sayHello());  //--> Hello I am 10 years old