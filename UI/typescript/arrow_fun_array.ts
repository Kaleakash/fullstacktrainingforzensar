let num:Array<number>=[100,200,300,400,500,600];
console.log("retireve records using forEach function with anonymous function")
num.forEach(function(v){
    console.log(v);
})

console.log("retrieve records using arrow function");
num.forEach((v)=>console.log(v));

