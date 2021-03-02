import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutusComponent } from './aboutus/aboutus.component';
import { ContactusComponent } from './contactus/contactus.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { LoginComponent } from './login/login.component';
import { NotFoundComponent } from './not-found/not-found.component';

// Routes is a pre-defined API which contains all path details which help 
// to navigate from one component to another component. 
const routes: Routes = [
  {path:"\login",component:LoginComponent},
  {path:"\aboutus",component:AboutusComponent},
  {path:"\contactus",component:ContactusComponent},
  {path:"\home",component:DashboardComponent},
  {path:"",redirectTo:"\login",pathMatch:"prefix"},
  {path:"**",component:NotFoundComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
