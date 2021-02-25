//Normal Function 
function dis1() {
    console.log("This is dis1 function");
}
dis1();
//Normal function with parameter 
function addNumber(a, b) {
    var sum = a + b;
    console.log("sum is " + sum);
}
addNumber(100, 200);
//Expression style function with name assign to variable 
var dis2 = function display() {
    console.log("This is dis2 function");
};
dis2();
//Expression style function without name assign to variable 
var dis3 = function () {
    console.log("This is dis3 function");
};
dis3();
//Number of parameter must be match but not data types. 
function dis4(id, name, salary) {
    console.log("id is " + id);
    console.log("name is " + name);
    console.log("salary is " + salary);
}
dis4(100, "Raj", 12000);
dis4("Mahesh", "Lokesh", "Ramesh");
//Number of parameter with their data types 
function dis5(id, name, salary) {
    console.log("id is " + id);
    console.log("name is " + name);
    console.log("salary is " + salary);
}
dis5(100, "Raj", 12000);
dis5(101, "Lokesh", 14000.50);
//ES5 function can return any value as well as return type is non mandatory. 
function dis6() {
    //return 10;
    //return "Welcome"
    //return true;
}
//TypeScript with ES6 function must return specific value 
//String type return 
function dis7() {
    return "Welcome";
}
//Number type return 
function dis8() {
    return 100;
}
// no return type then void 
function dis9() {
}
//return any type 
function dis10(fname) {
    if (fname == "Ajay") {
        return 100;
    }
    else {
        return "Unknown";
    }
}
//function with default parameter with ? operator
// default paramameter must be use from right side to left side 
//may be for one variable or all variable but not in between. 
function empInfo(id, name, salary, age) {
    console.log("id " + id);
    console.log("name " + name);
    console.log("salary " + salary);
    console.log("age is " + age);
}
empInfo(100, "Ramesh", 12000);
empInfo(101, "Ajay", 23000, 21);
empInfo(102, "Mahesh");
//function with default initialization 
// default initialization must be use from right side to left side 
//may be for one variable or all variable but not in between. 
function empInfoDetails(id, name, salary, age) {
    if (id === void 0) { id = 0; }
    if (name === void 0) { name = "Unknown"; }
    if (salary === void 0) { salary = 8000; }
    if (age === void 0) { age = 21; }
    console.log("id " + id);
    console.log("name " + name);
    console.log("salary " + salary);
    console.log("age is " + age);
}
empInfoDetails();
empInfoDetails(100);
empInfoDetails(101, "Ramesh");
empInfoDetails(102, "Ajay", 12000);
empInfoDetails(103, "Balaji", 18000, 24);
