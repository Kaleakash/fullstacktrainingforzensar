import { AfterContentChecked, Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
@Component({
  selector: 'app-product-item',
  templateUrl: './product-item.component.html',
  styleUrls: ['./product-item.component.css']
})
export class ProductItemComponent implements OnInit,AfterContentChecked {

  @Input()   // @Input decorator is use to receive the value from parent component's variable. 
  parentNameReceive:string=""

  @Input()      
  namesReceive:Array<string>=[];

  @Output()           //@Output with EventEmitter reference which help to pass value 
  eventRef = new EventEmitter<number>();  // from child to parent. 

  desg:string ="Tester";
  
  age:number=21;

  constructor() { }

  ngOnInit(): void {
  }

  ngAfterContentChecked() {   //using life cycle method passing the value through EventEmitter 
    this.eventRef.emit(this.age);   // ready to pass;
  }

  changeAge() {
    this.age =34 
    this.eventRef.emit(this.age);
  }
}
