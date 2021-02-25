var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Employee = /** @class */ (function () {
    function Employee(empId, empName, empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }
    Employee.prototype.displayInfo = function () {
        console.log("id is " + this.empName);
        console.log("name is " + this.empName);
        console.log("salary is " + this.empSalary);
    };
    return Employee;
}());
var Manager = /** @class */ (function (_super) {
    __extends(Manager, _super);
    function Manager(empId, empName, empSalary, numberOfEmp) {
        var _this = _super.call(this, empId, empName, empSalary) || this;
        _this.numberOfEmp = numberOfEmp;
        return _this;
    }
    Manager.prototype.displayMgrInfo = function () {
        console.log("Number of emp are " + this.numberOfEmp);
    };
    return Manager;
}(Employee));
//let emp1 = new Manager(100,"RAmesh",12000);
//emp1.displayInfo();
var emp1 = new Manager(101, "Raju", 18000, 12);
emp1.displayInfo();
emp1.displayMgrInfo();
