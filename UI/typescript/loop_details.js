var num = [100, 200, 300, 400, 500, 600, 700];
console.log("using for loop");
for (var i = 0; i < num.length; i++) {
    console.log(num[i]);
}
console.log("using in loop");
/*
    for(let variableName in arrayName){

    }
*/
for (var i in num) {
    console.log(num[i] + " " + i);
}
console.log("using of loop");
/*
    for(le varibleName of arrayName){

    }
*/
for (var _i = 0, num_1 = num; _i < num_1.length; _i++) {
    var n = num_1[_i];
    console.log(n);
}
