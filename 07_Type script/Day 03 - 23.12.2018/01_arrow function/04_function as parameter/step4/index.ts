
function execFunc(param: (x: number) => number): void {
  let res: number = param(3);
  console.log(res);
}


function incNum(num: number): number {
  return ++num;
}

execFunc((num) => num * 2);     //--> 6
execFunc(incNum);               //--> 4
