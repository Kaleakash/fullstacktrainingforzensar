import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SimpleService {

  constructor() { }

  checkUser(name:string,pass:string){
    if(name=="Ramesh" && pass=="123"){
      return "Success";
    }else {
      return "Failure";
    }
  }
}
