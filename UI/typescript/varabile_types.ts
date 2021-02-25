var a:number=10;
var a:number=20;            // Using var we can re-declare same variable with different values. 

let b:number=30;
//let b:number=40;                  //re-declaration 
b=40;                               // re-assign 

for(var i=0;i<=10000;i++){

}
console.log(i);
for(let j=0;j<=10000;j++){

}
//console.log(j)

function info(name){
        //let msg;
        if(name=="Ajay"){
            let msg="Welcome "+name;
        } else {
            msg ="Welcome Unknown";
        }
        return msg;
}
console.log(info("Vijay"))


const c:number=300;                 // const is use to declare the constant value we can't change. 
//c=400;




