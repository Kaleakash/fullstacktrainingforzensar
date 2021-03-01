var obj = new Promise(function(resolve,reject){

    reject("Your request rejected.."),
    resolve("Promise Done Successfully")
});
//callback Asynchronouse function 
obj.then(val=>console.log("In Then "+val)).catch(error=>console.log("In Error "+error));

//In Plain JavaScript 

fetch("URL").then().error()     // Normal JavaScript 
//axios("url").then.error()       //  in React JS 
//$http("url")                  //return type is Promise object Angular 1.x 