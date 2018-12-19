class Dog {

    private _age: number;

    public setAge(age: number): void {
        if (age > 0 && age < 200)
            this._age = age;
    }

    public getAge(): number {
        return this._age;
    }

}

let d1: Dog = new Dog();

d1.setAge(100);
console.log(d1.getAge());  //--> 100

d1.setAge(-5);
console.log(d1.getAge());  //--> 100

d1.setAge(50);
console.log(d1.getAge());  //--> 50

