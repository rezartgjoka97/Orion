import { Observable } from 'rxjs';
import { AuthService } from './../auth/auth.service';
import { Component, Injectable, OnInit, SimpleChanges } from '@angular/core';
import {UserName} from './../models/userName.model';
import {DataService} from'./../data.service';
import { async } from '@angular/core/testing';
import { Subscription } from 'rxjs';


@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styles: [
    `.angular-logo {
        margin: 0 4px 3px 0;
        height: 35px;
        vertical-align: middle;
    }
    .fill-remaining-space {
      flex: 1 1 auto;
    }
    `
  ]
})

export class HeaderComponent implements OnInit {
  clickEventsubscription:Subscription;
  isLoggedIn$: Observable<boolean>;
  userData: Array<any>=[];
  user: UserName={
    userName: ''
  }

  constructor(
    private authService: AuthService,
    private dataService: DataService, 
    ) {
      this.clickEventsubscription=this.authService.getClickEvent().subscribe(()=>{
        this.onLogin();
      })
     }


  ngOnInit() {
    this.isLoggedIn$ = this.authService.isLoggedIn;
    this.onLogin();
  }


  onLogin(){
      this.user=JSON.parse(localStorage.getItem('currentUser'));
      this.dataService.getUser(this.user).subscribe(res=>{
        if(res){
         this.userData.push(res);
        }
      });
  }

  onLogout() {
    this.userData=[];
    this.authService.logout();
  }

}