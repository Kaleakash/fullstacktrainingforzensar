import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.css']
})
export class OrderComponent implements OnInit {

  parentNameRecevie:string="";
  productRef:any="";
  constructor() { }

  ngOnInit(): void {
    let obj = sessionStorage.getItem("obj");
    let obj1 = sessionStorage.getItem("productObj");
    if(obj!=null){
    this.parentNameRecevie= obj;
    }
    if(obj1!=null){
      this.productRef = JSON.parse(obj1);//converting string to JSON. 
    }

  }

}
