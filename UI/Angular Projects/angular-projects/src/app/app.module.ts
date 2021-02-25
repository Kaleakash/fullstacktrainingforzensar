import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { SimpleComponent } from './simple/simple.component';
import { MainComponent } from './main/main.component';
import { DataBindingComponent } from './data-binding/data-binding.component';

@NgModule({
  declarations: [
    AppComponent,
    SimpleComponent,
    MainComponent,
    DataBindingComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
