import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(public httpClient:HttpClient) { }

  checkUser(loginRef:any):Observable<string>{
    return this.httpClient.post("http://localhost:8080/login/check",loginRef,{responseType:'text'});
  }
}
