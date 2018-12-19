interface IRun{
    startRun(speed:number):string;
}


interface ISleep{
    startSleep(time:number):string;
}


class Person implements IRun,ISleep{

    startRun(speed:number):string{
        return `I am starting to run at speed ${speed}`;
    }

    startSleep(time:number):string{
        return `I am going to sleep for ${time} hours`;
    }
}


let p:Person=new Person();
console.log(p.startRun(17));    //--> I am starting to run at speed 17
console.log(p.startSleep(10));  //--> I am going to sleep for 10 hours
