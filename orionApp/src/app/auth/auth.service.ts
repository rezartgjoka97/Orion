import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { BehaviorSubject, Observable, Subject } from 'rxjs';
import { user } from './../models/user.model';
import { DataService } from './../data.service'
import {UserName} from './../models/userName.model';

@Injectable()
export class AuthService {
  private loggedUserName: string=localStorage.getItem('currentUser');
  private isUserLoggeidIn: boolean=this.loggedUserName ? true : false;
  public loggedIn: BehaviorSubject<boolean> = new BehaviorSubject<boolean>(this.isUserLoggeidIn);
  private subject = new Subject<any>();
  
  get isLoggedIn() {
    return this.loggedIn.asObservable();
  }

  afterLogin(){
    this.subject.next();
  }

  getClickEvent(): Observable<any>{ 
    return this.subject.asObservable();
  }

  User: UserName={
    userName: ''
  }

  constructor(
    private router: Router,
    private dataService: DataService,
  ) {

  }

  login(userData: user) {
    this.dataService.userLogin(userData).subscribe(res=>{
      if(res == 1){
        this.User.userName=userData.userName;
        localStorage.setItem('currentUser', JSON.stringify(this.User));
        this.loggedIn.next(true);
        this.afterLogin();
        this.router.navigate(['/']);
      }
    });
  }

  logout() {
    localStorage.removeItem('currentUser');
    this.loggedIn.next(false);
    this.router.navigate(['/']);
  }
}