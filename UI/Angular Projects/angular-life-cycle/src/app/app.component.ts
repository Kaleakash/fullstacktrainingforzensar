import { AfterContentChecked, AfterContentInit, Component, OnChanges, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit,OnChanges,AfterContentInit,AfterContentChecked {
  title = 'angular-life-cycle';
  n:number=10;
  constructor(){          // constructor is use to achive DI
    console.log("object created... App Component");
  }
  ngOnInit() {
    console.log("Parent component ngOnInit Method called..")
  }
  ngOnChanges(){
    console.log("Parent onChange method called...")
  }
  ngAfterContentInit() {
    console.log("Parent content init")
  }
  ngAfterContentChecked() {
    console.log("Parent content checked...")
  }
}
