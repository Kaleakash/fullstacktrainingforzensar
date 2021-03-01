import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-delete-product',
  templateUrl: './delete-product.component.html',
  styleUrls: ['./delete-product.component.css']
})
export class DeleteProductComponent implements OnInit {

  constructor(public productSer:ProductService) { } //DI for Service

  msg:string="";
  ngOnInit(): void {
  }

  deleteProduct(pid:any){
    //console.log(pid);
    this.productSer.deletProductInfo(pid).subscribe(result=>this.msg=result);
  }
}
