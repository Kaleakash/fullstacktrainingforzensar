import { Pipe, PipeTransform } from "@angular/core";
@Pipe({name:"GenderPipe"})
export class GenderPipe implements PipeTransform {
    transform(value:any,gender?:any) {
        //console.log("Names are "+value);
        //console.log("Gender is "+gender)
        //return value;
        if(gender=="Male"){
            return "Mr. "+value;
        }else {
            return "Miss."+value;
        }
    }
}

/*
Sort records asc or desc. 
Filter recors using custom pipe  

*/