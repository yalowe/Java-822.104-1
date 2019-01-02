
class Service {
    private constructor() { }

    private static singleton: Service = new Service();
    
    public static getSingleton(): Service {
        return Service.singleton;
    }

    numberArray={numbers:[1, 2, 3]};

    public setArray(arr:number[]):void{
        this.numberArray.numbers=arr;
    }
}

class Component1 {
    myNumberArray: any;
    myService: Service;
    constructor() {
        this.myService = Service.getSingleton();
        this.myNumberArray = this.myService.numberArray;
    }

    public printInfo():void{
        console.log("myService:",this.myService);
        console.log("myNumberArray:",this.myNumberArray);
    }
}


class Component2 {
    myService: Service;
    constructor() {
        this.myService = Service.getSingleton();
    }


    public setArrayInService():void{
        this.myService.setArray([9,8,7]);
    }
}



let c1:Component1=new Component1();
let c2:Component2=new Component2();

console.log("---------------step 1---------------------");
c1.printInfo();

c2.setArrayInService();


console.log("---------------step 2---------------------");
c1.printInfo();


/*
OUTPUT:
_______________________________
---------------step 1---------------------
myService: Service { numberArray: { numbers: [ 1, 2, 3 ] } }
myNumberArray: { numbers: [ 1, 2, 3 ] }
---------------step 2---------------------
myService: Service { numberArray: { numbers: [ 9, 8, 7 ] } }
myNumberArray: { numbers: [ 9, 8, 7 ] }

*/