/*export interface Product {          // it use to map the json data. 
    pid:number;
    pname:string;
    price :number;
    storeDate:Date;
}
*/

export class Product {
    constructor(public pid?:number,
        public pname?:string,
        public price?:number,
        public storeDate?:Date){}
}
