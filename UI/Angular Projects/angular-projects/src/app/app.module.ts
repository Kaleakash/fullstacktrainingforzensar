import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { SimpleComponent } from './simple/simple.component';
import { MainComponent } from './main/main.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TemplateDrivenFormComponent } from './template-driven-form/template-driven-form.component';
import { ModelDrivenFormComponent } from './model-driven-form/model-driven-form.component';
import { DemoComponent } from './demo/demo.component';
import {HttpClientModule} from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    SimpleComponent,
    MainComponent,
    DataBindingComponent,
    TemplateDrivenFormComponent,
    ModelDrivenFormComponent,
    DemoComponent
  ],
  imports: [
    BrowserModule,FormsModule,ReactiveFormsModule,HttpClientModule
  ],
  providers: [],    // register service class on module level 
  bootstrap: [AppComponent]
})
export class AppModule { }
