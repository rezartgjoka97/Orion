import { Component, Injectable, OnInit } from '@angular/core';
import {customers} from './../models/customers.model';
import {DataService} from'./../data.service';
import { Router } from '@angular/router';
import { AuthService } from './../auth/auth.service';
import {MatSnackBar} from '@angular/material/snack-bar';
import { user } from './../models/user.model';
import { UserName } from '../models/userName.model';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})

export class RegisterComponent implements OnInit {
	
	userName: string="";
	firstName: any="";
	middleName: any="";
	lastName: any="";
	eMail: any="";
	password: any="";
	phone: any="";
	address: any="";
	city: any="";
	country: any="";
	zipCode: any="";
	
	customer: customers={
	username: '',
	first_name: '',
	middle_name: '',
	last_name: '',
	email: '',
	password: '',
	phone: '',
	address: '',
	city: '',
	country: '',
	zip_code: '',
};
user: user={
	userName: '',
	password: ''
}

User: UserName={
    userName: ''
  }
	
  constructor(
	private dataService: DataService, 
	private router: Router, 
	private _snackBar: MatSnackBar,
	private authService: AuthService,
	) {}

  ngOnInit(): void {

  }


updateCustomers(){
	this.customer.username=this.userName;
	this.customer.first_name=this.firstName;
    this.customer.middle_name=this.middleName;
    this.customer.last_name=this.lastName;
    this.customer.email=this.eMail;
    this.customer.password=this.password;
    this.customer.phone=this.phone;
    this.customer.address=this.address;
    this.customer.city=this.city;
    this.customer.country=this.country;
	this.customer.zip_code=this.zipCode;
	if(this.userName=='' || this.password ==''){
		this._snackBar.open('Please make sure that username and password fields are filled! ', 'Close', {
			duration: 3000,
			verticalPosition: 'top',
			horizontalPosition: 'center'
		  });
	}
	else{
this.dataService.updateCustomers(this.customer).subscribe(resp =>{
	if(resp){
		this.User.userName=this.customer.username;
		localStorage.setItem('currentUser', JSON.stringify(this.User));
		this.authService.afterLogin();
		this.authService.loggedIn.next(true);
		this.router.navigate(['/']);
	}
});
}
	
}



}
