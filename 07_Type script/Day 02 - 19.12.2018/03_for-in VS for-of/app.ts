let arr:string[]=["a","b","c"];


console.log("------------arr for-in--------------");
for(let x in arr){
    console.log(x);
}



console.log("------------arr for-of--------------");
for(let x of arr){
    console.log(x);
}

/*
OUTPUT:
_______________________
------------arr for-in--------------
0
1
2
------------arr for-of--------------
a
b
c
*/