/*class Employee {
    empId:number;
    empName:string;
    constructor() {
        this.empId=100;
        this.empName="Ramesh";
        console.log("object created...")
    }
    displayInfo():void {
        console.log("id is "+this.empId+" Name is "+this.empName);
    }
}
let emp1 = new Employee();
emp1.displayInfo();*/
/*
class Employee {
    empId:number;
    empName:string;
    constructor(empId?:number,empName?:string) {      // parameterized constructror combination of three constructor.
        this.empId=empId;
        this.empName=empName;
    }
    displayInfo():void {
        console.log("id is "+this.empId+" Name is "+this.empName);
    }
}
let emp1 = new Employee(100,"Ramesh");
emp1.displayInfo();
let emp2 = new Employee(101);
emp2.displayInfo();
let emp3 = new Employee();
emp3.displayInfo();
*/
var Employee = /** @class */ (function () {
    function Employee(empId, empName) {
        this.empId = empId;
        this.empName = empName;
    }
    Employee.prototype.displayInfo = function () {
        console.log("id is " + this.empId + " Name is " + this.empName);
    };
    return Employee;
}());
var emp1 = new Employee(100, "Ram");
//console.log("id is "+emp1.empId);
//console.log("name is "+emp1.empName)
emp1.displayInfo();
