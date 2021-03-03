import { Component, OnInit } from '@angular/core';
import { Employee } from './employee.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'angular-pipe';
  employees:Array<Employee>=[];
  ngOnInit() {
    let emp1 = new Employee(100,"Ravi",12000,"Male",new Date());
    let emp2 = new Employee(101,"Reeta",14000,"Female",new Date());
    let emp3 = new Employee(102,"Ramesh",16000,"Male",new Date());
    let emp4 = new Employee(103,"Seeta",18000,"Female",new Date());
    this.employees.push(emp1);
    this.employees.push(emp2);
    this.employees.push(emp3);
    this.employees.push(emp4);
  }
}
