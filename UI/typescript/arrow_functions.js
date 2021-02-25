var fun1 = function () {
    console.log("This is expression function");
};
fun1();
//passing parametetr to normal function style 
function addNumber1(a, b) {
    var sum = a + b;
    return sum;
}
//passing parameter to expression style function 
var addNumber2 = function (a, b) {
    var sum = a + b;
    return sum;
};
//arrow function is like a lambda expression in java. Arrow function is a replacement of anonymous function  
var fun2 = function () { return console.log("This is arrow function"); };
fun2();
//arrow function passing parameter 
var addNumber3 = function (a, b) { return a + b; };
console.log(addNumber1(1, 2));
console.log(addNumber2(1, 2));
console.log(addNumber3(1, 2));
