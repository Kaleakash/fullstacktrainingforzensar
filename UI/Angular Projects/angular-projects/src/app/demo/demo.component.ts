import { Component, OnInit } from '@angular/core';
import { Demo1Service } from 'src/app/demo1.service';
import {DemoService} from '../demo.service';
@Component({
  selector: 'app-demo',
  templateUrl: './demo.component.html',
  styleUrls: ['./demo.component.css'],
  providers:[Demo1Service]     // register on component level
})
export class DemoComponent implements OnInit {
  msg1:string=""
  msg2:string="";
  constructor(public obj2:Demo1Service) { }   
                                          //pull object from container 
                                          //DI
  ngOnInit(): void {
  }

  fun1() {
    let obj1 = new DemoService();
    this.msg1 = obj1.display1();
  }
  fun2() {
    this.msg2 = this.obj2.display1();
  }

  loadData() : void {
    this.obj2.loadFakeServiceData();
  }
}
