import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-model-driven-form',
  templateUrl: './model-driven-form.component.html',
  styleUrls: ['./model-driven-form.component.css']
})
export class ModelDrivenFormComponent implements OnInit {
//<form #userRef = "ngForm">
//input type="text" name="user" ngModel/>
//<input type="password" name="pass" ngModel/>
userRef = new FormGroup({
  user:new FormControl(),
  pass:new FormControl(),

  });

msg:string="";
  constructor() { }
  ngOnInit(): void {
  }
  checkUser() {  
    console.log(this.userRef);
    let userName = this.userRef.get("user")?.value;
    let passName = this.userRef.get("pass")?.value;
    if(userName=="Ramesh" && passName=="123"){
        this.msg = "Successfully Login";
    }else {
        this.msg = "Failure try once again";
    }
  }
}

