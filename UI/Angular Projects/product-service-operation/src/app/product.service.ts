
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from './product.model';

@Injectable({
  providedIn: 'root'      // This attribute register the serivce on module level. 
                           // no need to write in provide attirbute in app.module.js 
})
export class ProductService {
abc:string="info";
  constructor(public httpClient:HttpClient) { }

/*
  loadProductDetails() {
    this.httpClient.get("http://localhost:9090/product/allProductData").
    subscribe(data=>console.log(data),
    error=>console.log(error),
    ()=>console.log("completed"));
  }
  */
 loadProductDetails(): Observable<Product[]>{
   return this.httpClient.get<Product[]>("http://localhost:9090/product/allProductData")
 }

 //post(url,dataInJson,responseBody) :1st parameter url and second parameter json data, third parameter response details(optional) by defaut json 

storeProductInfo(productRef:any):Observable<string>{
 // this.httpClient.post("http://localhost:9090/product/storeProductData",productRef).subscribe(result=>console.log(result));
 return this.httpClient.post("http://localhost:9090/product/storeProductData",productRef,{responseType:'text'})
}

//put(url,updateJsonData,responseBody)

updateProductInfo(productRef:any ):Observable<string>{
  return this.httpClient.put("http://localhost:9090/product/updateProductData",productRef,{responseType:'text'});
}

//delete(url,responseBody)
deletProductInfo(pId:any):Observable<string>{
return this.httpClient.delete("http://localhost:9090/product/deleteProductData/"+pId,{responseType:'text'})
}

findProductById(pId:any):Observable<any>{
  return this.httpClient.get("http://localhost:9090/product/findProductById/"+pId);
}
}



