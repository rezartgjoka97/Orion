import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { AuthGuard } from './auth/auth.guard';
import { LoginComponent } from './login/login.component';
import { HomePageComponent } from './home-page/home-page.component';
import {RegisterComponent } from './register/register.component'

const routes: Routes = [
  // { path: '', component: HomePageComponent, canActivate: [AuthGuard] },
  { path: '', component: HomePageComponent},
  { path: 'login', component: LoginComponent },
  {path: 'register', component: RegisterComponent},
  { path: '**', redirectTo: ''},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }