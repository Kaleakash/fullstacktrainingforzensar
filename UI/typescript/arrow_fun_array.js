var num = [100, 200, 300, 400, 500, 600];
console.log("retireve records using forEach function with anoumous function");
num.forEach(function (v) {
    console.log(v);
});
console.log("retrieve records using arrow function");
num.forEach(function (v) { return console.log(v); });
