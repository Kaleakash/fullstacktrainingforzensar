import { Component, OnInit } from '@angular/core';
import { Product } from '../product.model';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-retrieve-product',
  templateUrl: './retrieve-product.component.html',
  styleUrls: ['./retrieve-product.component.css']
})
export class RetrieveProductComponent implements OnInit {

  productInfo:Array<Product>=[];
  flag:boolean = false;
  names:Array<string>=["Ramesh","Ajay","Vikash","Lokesh"];

  constructor(public productSer:ProductService) { }

  ngOnInit(): void {
    this.flag=true;
    this.productSer.loadProductDetails().subscribe(data=>this.productInfo=data);
  }
  
  loadData() {
    this.flag=true;
    this.productSer.loadProductDetails().subscribe(data=>this.productInfo=data);
  }

}
