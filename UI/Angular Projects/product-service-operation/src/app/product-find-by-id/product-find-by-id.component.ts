import { Component, OnChanges, OnInit } from '@angular/core';
import { Product } from '../product.model';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product-find-by-id',
  templateUrl: './product-find-by-id.component.html',
  styleUrls: ['./product-find-by-id.component.css']
})
export class ProductFindByIdComponent implements OnInit {

  pid:number=0;
  msg:string=""
  productRef= new Product();
  flag:boolean = false;
  constructor(public prodSer:ProductService) { } //DI for SErvice 

  ngOnInit(): void {
  }

  callService() {
    //console.log("Event fired "+this.pid)
    this.prodSer.findProductById(this.pid).subscribe(data=> {
      if(data==null){
        //console.log("Record not found")
        this.msg = "REcord not found";
      this.flag= false;
      }else {
        this.msg = "";
        this.flag = true;
        this.productRef=data;        
      }
    })
  }
}
