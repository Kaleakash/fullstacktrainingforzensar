import { Component, Input, OnChanges, OnInit } from '@angular/core';
@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit,OnChanges {
  @Input()
  m:number=0;
  constructor() {
    console.log("object created -- Child component")
   }

  ngOnInit(): void {
    console.log("Child component ngOnInit Method called..")
  }

  ngOnChanges(){
    console.log("Child onChange method called...")
  }
}
