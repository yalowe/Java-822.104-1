//Cannot create an instance of an abstract class.
abstract class Person {
    private _age: number;

    set age(val: number) {
        if (val > 0 && val < 120)
            this._age = val;
    }

    get age(): number {
        return this._age;
    }


    private _name: string;

    set name(val: string) {
        if (val.length >= 3)
            this._name = val;
    }

    get name(): string {
        return this._name;
    }


    constructor(age: number, name: string) {
        this.age = age;
        this.name = name;
    }

    //Non-abstract sub-class of 'Person' must implement inherited abstract member 'sayHello'
    abstract sayHello(): string;
}


class Student extends Person {
    private _grade: number;

    set grade(val: number) {
        if (val >= 0 && val <= 100)
            this._grade = val;
    }

    get grade(): number {
        return this._grade;
    }

    constructor(age: number, name: string, grade: number) {
        super(age, name);
        this.grade = grade;
    }


    public sayHello(): string{
        return "Hello I am a Student";
    }

}


class Teacher extends Person {
    private _salary: number;

    set salary(val: number) {
        if (val > 0)
            this._salary = val;
    }

    get salary(): number {
        return this._salary;
    }

    constructor(age: number, name: string, salary: number) {
        super(age, name);
        this.salary = salary;
    }

    public sayHello(): string{
        return "Hello I am a Teacher";
    }

}


let arr: Person[] = [
    new Teacher(30, "Bob", 10000),
    new Teacher(40, "Alice", 20000),
    new Student(16, "Jerry", 100),
    new Student(40, "Tom", 90)
];


for (let p of arr) {
    if (p instanceof Teacher) {
        console.log(p.sayHello(),p.name, p.age, (p as Teacher).salary)
    }
    else if (p instanceof Student) {
        console.log(p.sayHello(),p.name, p.age, (p as Student).grade)
    }
    
}


/*

OUTPUT:
_________________________

Hello I am a Teacher Bob 30 10000
Hello I am a Teacher Alice 40 20000
Hello I am a Student Jerry 16 100
Hello I am a Student Tom 40 90

*/