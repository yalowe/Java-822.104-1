// f1 gets no parameters and returns void
let f1=()=>{console.log("f1")};


// f2 gets one parameter and returns void
let f2=(num)=>{console.log(num)};



// f3 gets one parameter and returns void
/*
-------!!! RULE 1 !!!!-------
If the arrow function takes only one parameter 
we can remove the ()
*/
let f3=num=>{console.log(num)};



// f4 gets one parameter and returns a number
let f4=num=>{return num*2};



// f5 gets one parameter and returns a number
/*
-------!!! RULE 2 !!!!-------
If the arrow function's body contains only on command
and the command is a return command
we can move {return }
*/
let f5=num=>num*2;

