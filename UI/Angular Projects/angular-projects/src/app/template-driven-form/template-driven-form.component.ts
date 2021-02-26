import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-template-driven-form',
  templateUrl: './template-driven-form.component.html',
  styleUrls: ['./template-driven-form.component.css']
})
export class TemplateDrivenFormComponent implements OnInit {
  msg:string="";
  constructor() { }

  ngOnInit(): void {
  }
  checkUser(userInfo:any){
   // console.log(userInfo);
   let userName = userInfo.user;
   let passName = userInfo.pass;
   if(userName=="Ravi" && passName=="123"){
      this.msg = "Successfully Login";
   }else {
      this.msg ="Failure try once again";
   }
  }
}
