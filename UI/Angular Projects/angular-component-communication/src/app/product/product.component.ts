import { Component, OnInit, ViewChild } from '@angular/core';
import { ProductItemComponent } from '../product-item/product-item.component';
import { Product } from '../product.model';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  parentName:string="Ramesh Kumar";
  names:Array<string>=[];
  
  childAge:number=0;

  productRef= new Product(1010,"TV",67000);
  
  constructor() { }

  ngOnInit(): void {
    sessionStorage.setItem("obj",this.parentName);
    sessionStorage.setItem("productObj", JSON.stringify(this.productRef)); // converting json to string 
  }

  addNames(name:any){
      this.names.push(name);        // adding name one by one
  }
}
