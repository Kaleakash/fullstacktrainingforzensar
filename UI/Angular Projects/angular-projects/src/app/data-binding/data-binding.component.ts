import { Component, OnInit } from '@angular/core';

//import {FormsModule} from '@angular/forms';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent  {
  fname:string="Ajay";
  lname:string="Kumar";
  age:number=21;
  desg:string="Tester";
  constructor() { }


  changeAge() {
    this.age = 32;    
  }
  skill:any;    // instance variable 
  passSkillSet(skill:any){  // parameter variable. 
    console.log(skill);
    this.skill=skill;
  }
}

