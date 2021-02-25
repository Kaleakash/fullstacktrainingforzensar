var num = [100, 200, 300, 400, 500, 600, 700];
console.log("callback with function name");
num.forEach(display);
function display(n) {
    console.log("The value of n is " + n);
}
console.log("callback with fuction body");
num.forEach(function (n) {
    console.log("The value of n is " + n);
});
