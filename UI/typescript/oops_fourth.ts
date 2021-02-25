/*interface Emp {
    empId:number;
    empName?:string;
    dis():void;
}

class EmployeeImp implements Emp {
    empId:number=100;
    //empName:string="Ramesh";

    dis(): void {
        console.log("This is dis function");
    }
}
*/
interface Employee {           
    id:number;
    name:string;
    salary:number;
    age?:number;
}
let emp1:Employee = {id:100,name:"Ramesh",salary:140000};        //object creating in literal style. 
let emp2:Employee = {id:101,name:"Ravi",salary:16000};
let emp3:Employee = {id:102,name:"Lokesh",salary:18000,age:21};

