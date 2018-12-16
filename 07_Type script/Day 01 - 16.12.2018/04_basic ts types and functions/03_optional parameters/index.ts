

//default parameters
function func1(num1:number=2,num2:number=3):void{
    console.log(`num1: ${num1}, num2: ${num2}`);
}


func1();               //--> num1: 2, num2: 3
func1(10);             //--> num1: 10, num2: 3
func1(1, 1);           //--> num1: 1, num2: 1



//optional parameters
function func2(num1:number,num2?:number):void{
    console.log(`num1: ${num1}, num2: ${num2}`);
}

func2(10);             //--> num1: 10, num2: undefined
func2(1, 1);           //--> num1: 1, num2: 1