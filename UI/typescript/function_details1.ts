function empInfo(id:number,name:string,salary:number,skillSet?:Array<string>){
    console.log("id "+id);
    console.log("name",name);
    console.log("salary",salary);
    console.log("skillSet ",skillSet);
    
}
let tech:string[]=[];
empInfo(1,"Ravi",15000)
empInfo(2,"Ramesh",16000,tech);
empInfo(2,"Ramesh",16000,tech);

// Parameter takes 0, 1 or many values. 
// In one function we can use only one rest operator or parameter and it must be last parameter.              
function empInfoRest(id:number,name:string,salary:number,...skillSet:Array<string>){    //Rest Operator or Parameter
    console.log("id "+id);
    console.log("name",name);
    console.log("salary",salary);
    console.log("Number of skillSet "+skillSet.length);
    console.log("skillSet ",skillSet);
}
let skillSetInfo:string[]=["HTML","CSS","JavaScript","Bootstrap"];
empInfoRest(1,"Raj",12000);             //zero 
empInfoRest(2,"Ramesh",14000,"C")       //1 
empInfoRest(3,"Mahesh",16000,"C","C++");
empInfoRest(4,"Lokesh",25000,"C","Java","Angular","Spring boot");
empInfoRest(5,"Seeta",34000,...skillSetInfo,"ReacJS");       // spread operator or parameter 
//This operator is use to pass the for rest operator if value are arrray type. 
/*
    public static void main(String...args){

    }

*/

