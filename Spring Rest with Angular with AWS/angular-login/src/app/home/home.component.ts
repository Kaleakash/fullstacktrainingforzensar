import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  name:string=""
  constructor() { }

  ngOnInit(): void {
    let obj = sessionStorage.getItem("obj")
      if(obj!=null){
        this.name=obj;
      }
  }

}
