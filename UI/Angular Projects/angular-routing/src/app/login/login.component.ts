import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  msg:string=""
  constructor(public router:Router) { }   //DI for Router which help to do routing programmatially

  ngOnInit(): void {
  }

  checkUser(userRef:any) {
    //console.log(userRef)
    let user = userRef.user;
    let pass  = userRef.pass;
    if(user=="Raj" && pass=="123"){
      console.log("Successfully Login")
      sessionStorage.setItem("name",user);    // set user name receive from database using RESTAPI
      /*
            1. We can store unique Id for that specific entity. 
            2. We can store sessionId 
            3. JWT : Json Web tooken 
      */
      this.router.navigate(["home"])
    }else {
      console.log("Failure try once again")
      this.msg = "UserName or password is wrong";
    }
  }

  /*

  this.userSer.checkUserService(userRef).subscribe(data=> {
    //let user = data.user;
    //let pass = data.pass;
  if(data=="Success"){
      console.log("Successfully Login")
      sessionStorage.setItem("user",userRef.user);
      this.router.navigate(["home"])
    }else {
      console.log("Failure try once again")
      this.msg = "UserName or password is wrong";
    }
  },error=>console.log(error))

  */
}
