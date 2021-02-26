import { Injectable } from "@angular/core";
import {HttpClient} from '@angular/common/http';

@Injectable()         // this decorator we use on service class. 
export class Demo1Service {
    
    constructor(public http:HttpClient){} //DI for HttpClient 

    display1():string {
        return "Welcome to Angular Service Using DI";
    }

    loadFakeServiceData() : void {
        this.http.get("https://jsonplaceholder.typicode.com/todos").subscribe(data=>console.log(data));
    }
}