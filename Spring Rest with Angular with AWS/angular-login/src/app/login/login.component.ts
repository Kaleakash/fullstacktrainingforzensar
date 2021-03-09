import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(public loginService:LoginService,public router:Router) { }

  ngOnInit(): void {
  }
  verify(loginRef:any){
    this.loginService.checkUser(loginRef).subscribe(result=>{
      if(result=="success"){
          console.log("successfully done!")
          sessionStorage.setItem("obj","Akash");
          this.router.navigate(["home"])
      }else {
          console.log("Failure try once again")
      }
    })
  }
}
