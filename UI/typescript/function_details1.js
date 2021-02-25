var __spreadArray = (this && this.__spreadArray) || function (to, from) {
    for (var i = 0, il = from.length, j = to.length; i < il; i++, j++)
        to[j] = from[i];
    return to;
};
function empInfo(id, name, salary, skillSet) {
    console.log("id " + id);
    console.log("name", name);
    console.log("salary", salary);
    console.log("skillSet ", skillSet);
}
var tech = [];
empInfo(1, "Ravi", 15000);
empInfo(2, "Ramesh", 16000, tech);
empInfo(2, "Ramesh", 16000, tech);
// Parameter takes 0, 1 or many values. 
// In one function we can use only one rest operator or parameter and it must be last parameter.              
function empInfoRest(id, name, salary) {
    var skillSet = [];
    for (var _i = 3; _i < arguments.length; _i++) {
        skillSet[_i - 3] = arguments[_i];
    }
    console.log("id " + id);
    console.log("name", name);
    console.log("salary", salary);
    console.log("Number of skillSet " + skillSet.length);
    console.log("skillSet ", skillSet);
}
var skillSetInfo = ["HTML", "CSS", "JavaScript", "Bootstrap"];
empInfoRest(1, "Raj", 12000); //zero 
empInfoRest(2, "Ramesh", 14000, "C"); //1 
empInfoRest(3, "Mahesh", 16000, "C", "C++");
empInfoRest(4, "Lokesh", 25000, "C", "Java", "Angular", "Spring boot");
empInfoRest.apply(void 0, __spreadArray(__spreadArray([5, "Seeta", 34000], skillSetInfo), ["ReacJS"])); // spread operator or parameter 
//This operator is use to pass the for rest operator if value are arrray type. 
/*
    public static void main(String...args){

    }

*/
