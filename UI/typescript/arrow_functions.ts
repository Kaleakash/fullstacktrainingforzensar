let fun1 = function() {
    console.log("This is expression function")
}
fun1();
//passing parametetr to normal function style 
function addNumber1(a:number,b:number):number {
    let sum = a+b;
    return sum;
}
//passing parameter to expression style function 
let addNumber2 = function(a:number,b:number):number{
    let sum = a+b;
    return sum;
}
//arrow function is like a lambda expression in java. Arrow function is a replacement of anonymous function  
let fun2 = ()=> console.log("This is arrow function");
fun2();
//arrow function passing parameter 
let addNumber3 = (a:number,b:number)=>a+b;
console.log(addNumber1(1,2));
console.log(addNumber2(1,2));
console.log(addNumber3(1,2));
