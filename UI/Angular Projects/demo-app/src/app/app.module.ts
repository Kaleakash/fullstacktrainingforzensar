import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { FooterComponent } from './app.footer';
import { HeaderComponent } from './header.component';

@NgModule({
  declarations: [
    AppComponent,HeaderComponent,FooterComponent
  ],
  imports: [
    BrowserModule       // it is use to display the output on browser. 
  ],
  providers: [],        // Angular Service details. 
  bootstrap: [AppComponent]   // which component you want to display as first or parent component 
})

export class AppModule { }
