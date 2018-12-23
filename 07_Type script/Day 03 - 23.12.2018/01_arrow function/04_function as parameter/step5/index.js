


function execFunc(param) {
    var res = param(3);
    console.log(res);
}


function incNum(num) {
    return ++num;
}


execFunc(function (num) { return num * 2; }); //--> 6
execFunc(incNum); //--> 4
