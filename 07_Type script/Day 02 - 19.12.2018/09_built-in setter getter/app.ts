class Dog {

    private _age: number;

    set age(val: number){
        if (val > 0 && val < 200)
            this._age = val;
    }

    get age(): number {
        return this._age;
    }

}

let d1: Dog = new Dog();


//here we call the getter
d1.age=100;

//here we call the setter
console.log(d1.age);  //--> 100



d1.age=-5;
console.log(d1.age);  //--> 100

d1.age=50;
console.log(d1.age);  //--> 50