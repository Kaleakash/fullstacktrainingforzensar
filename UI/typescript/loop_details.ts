let num:Array<number>=[100,200,300,400,500,600,700];
console.log("using for loop");
for(let i=0;i<num.length;i++){
    console.log(num[i]);
}
console.log("using in loop")
/*
    for(let variableName in arrayName){

    }
*/
for(let i in num){
    console.log(num[i]+" "+i)
}
console.log("using of loop")
/*
    for(le varibleName of arrayName){

    }
*/
for(let n of num){
    console.log(n)
}












