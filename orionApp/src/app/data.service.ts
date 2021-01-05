import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {customers } from './models/customers.model';
import { user } from './models/user.model';
import {UserName} from './models/userName.model';


@Injectable({
	providedIn: 'root'
})


export class DataService{
	apiUrl="http://localhost:8080/orionBE/";
	
	
	constructor(private http: HttpClient){
	
}


getCustomers(){
	var customersApiUrl=this.apiUrl+"CustomerController";
	
	return this.http.get<customers[]>(customersApiUrl);
}

updateCustomers(customers: customers){
		var customersApiUrl=this.apiUrl+"CustomerController";
		const body=JSON.stringify(customers);
	return this.http.post(customersApiUrl, body);
}

userLogin(user: user){
	var loginUrl=this.apiUrl + "UserAuth";
	const body=JSON.stringify(user);
	return this.http.post(loginUrl, body);
}

getUser(userName: UserName){
	var getUserUrl=this.apiUrl+"GetUser";
	const body=JSON.stringify(userName);
	return this.http.post<customers[]>(getUserUrl, body);
}

}