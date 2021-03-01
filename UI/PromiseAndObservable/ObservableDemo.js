import {Observable} from 'rxjs';
var obj = new Observable((data)=> {
    data.error("Error Generated...")
    data.next("First Info")
    data.next("Second Info")
    //data.error("Error Generated...")
    data.next("Third Info")
    data.complete();
})
//subscribe method is use to load the data from observable . This methods takes 3 parameter as a callback function 
// we can use anonymous function or arrow function  
//1st parameter then to load the data one by one 
//2nd error this method call if any error generate at starting time or middle of the flow. 
//3rd parameter get called after loaded all the data successfully..
obj.subscribe(data=>console.log(data),error=>console.log(error),()=>console.log("Completed"));
//HttpClient httpClient
//httpClient.get("URL").subscribe(val=>console.log(val))

// HttpClient get(), post(), put(), and delete() method return type is Observable object. 

