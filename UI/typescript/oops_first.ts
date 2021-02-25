function Person(){      // function itself is behave like a class upto ES5
    this.pid =100;
    this.pname = "Ramesh";
    this.displayInfo = function() {
        console.log("This is person function")
        console.log("Person Id is "+this.pid);
        console.log("Person Name is "+this.pname);
    }
}
let p1 = new Person();
p1.displayInfo();
class Employee {                // from ES6 we can use class keyword. 
    empId:number=100;
    empName:string="Ramesh";
    displayEmpInfo() : void {
        console.log("This is Employee function")
        console.log("Employee id is "+this.empId)
        console.log("Employee name is "+this.empName);
    }
}
let emp1 = new Employee();
emp1.displayEmpInfo();
