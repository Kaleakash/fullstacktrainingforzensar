import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular-testing';
  name:string="Akash Kale";

  display(name:any): string {
    return "welcome "+name;
  }
  
}
