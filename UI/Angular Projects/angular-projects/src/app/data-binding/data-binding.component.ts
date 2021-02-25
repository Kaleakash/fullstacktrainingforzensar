import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent implements OnInit {
  fname:string="Ajay";
  lname:string="Kumar";
  age:number=21;
  
  constructor() { }

  ngOnInit(): void {
  }

  changeAge() {
    this.age = 32;    
  }
}
