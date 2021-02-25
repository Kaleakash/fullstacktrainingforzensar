function Person() {
    this.pid = 100;
    this.pname = "Ramesh";
    this.displayInfo = function () {
        console.log("This is person function");
        console.log("Person Id is " + this.pid);
        console.log("Person Name is " + this.pname);
    };
}
var p1 = new Person();
p1.displayInfo();
var Employee = /** @class */ (function () {
    function Employee() {
        this.empId = 100;
        this.empName = "Ramesh";
    }
    Employee.prototype.displayEmpInfo = function () {
        console.log("This is Employee function");
        console.log("Employee id is " + this.empId);
        console.log("Employee name is " + this.empName);
    };
    return Employee;
}());
var emp1 = new Employee();
emp1.displayEmpInfo();
