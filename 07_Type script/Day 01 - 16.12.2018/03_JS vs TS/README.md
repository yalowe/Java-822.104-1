# JS
### Non strongly typed


* There is no types in js
```javascript
var x=4;
x="hello";
x=true;
x=[1,2,3];
```



* There is no check of arguments sending to functions
```javascript
function f(n1,n2){
    console.log(n1*n2);
}

f("a","b");  //--> NaN
f(1);        //--> NaN
f(1,2);      //--> 2
f(1,2,3);    //--> 2
```


# TS
### Strongly typed
* Every browser can run : HTML, CSS, JS
* In order to run TS code in the browser - we need to compile ts to js