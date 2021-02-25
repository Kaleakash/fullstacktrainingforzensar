import { Component } from '@angular/core';    //import {dis} from './a'

@Component({                      // decorator : @Component 
  selector: 'app-root',           //<app-root></app-root>
  templateUrl: './app.component.html',    // this property use to connect html (template ) page.
  styleUrls: ['./app.component.css']    //this like a link external CSS file 
})
export class AppComponent {
  title = 'demo-app';
  name:string ="Akash Kale";
  desg: string ="Trainer";
  dis() : string {
    return "Welcome to Angular Project";
  }
}
