import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-update-product',
  templateUrl: './update-product.component.html',
  styleUrls: ['./update-product.component.css']
})
export class UpdateProductComponent implements OnInit {

  msg:string=""
  constructor(public productSer:ProductService) { }   //DI for Service class. 

  ngOnInit(): void {
  }

  updateProductInfo(productInfo:any){
    //console.log(productInfo)
    this.productSer.updateProductInfo(productInfo).subscribe(data=>this.msg=data);
  }
}
