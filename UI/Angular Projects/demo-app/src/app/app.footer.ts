import {Component} from '@angular/core'

@Component({
    selector:"app-footer",
    template:`<h1>This footer<br/>
            This is another message using backstick symbol<br/>
            This is another messag
    {{msg}}</h1>`,
    styles:["h1{color:green}"]
})
export class FooterComponent {
    msg:string="This footer component";
}   