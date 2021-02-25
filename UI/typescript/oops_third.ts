class Employee {
    constructor(public empId:number,public empName:string,public empSalary:number){}
    displayInfo() : void {
        console.log("id is "+this.empName);
        console.log("name is "+this.empName);
        console.log("salary is "+this.empSalary);
    }
}
class Manager extends Employee {
    constructor(empId:number,empName:string,empSalary:number,public numberOfEmp:number){
        super(empId,empName,empSalary);
    }
    public displayMgrInfo() : void {
        console.log("Number of emp are "+this.numberOfEmp);
    }
}
let emp2 = new Manager(100,"RAmesh",12000,10);
emp2.displayInfo();
let emp1  = new Manager(101,"Raju",18000,12);
emp1.displayInfo();
emp1.displayMgrInfo();
/*
class Employee {
    constructor() {

    }
}
class Manager extends Employee {
    constructor() {
        super();
    }
}

*/