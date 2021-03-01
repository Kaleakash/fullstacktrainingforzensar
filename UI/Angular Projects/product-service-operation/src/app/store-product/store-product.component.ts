import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-store-product',
  templateUrl: './store-product.component.html',
  styleUrls: ['./store-product.component.css']
})
export class StoreProductComponent implements OnInit {
productInfo = new FormGroup({
pid:new FormControl(),
pname:new FormControl(),
price:new FormControl(),
storeDate:new FormControl()
});

msg:string=""
  constructor(public productSer:ProductService) { }   //DI for Service class 

  ngOnInit(): void {
  }

  storeProductDetails() {
    //console.log(this.productInfo.value)
    let productRef = this.productInfo.value;
    this.productSer.storeProductInfo(productRef).subscribe(result=>this.msg=result);
  }
}
