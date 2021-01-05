package com.servletangular.beans;

public class customer {

	public int customer_id;
	/**
	 * @return the customer_id
	 */
	public int getCustomer_id() {
		return customer_id;
	}


	/**
	 * @param customer_id the customer_id to set
	 */
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}


	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}


	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}


	/**
	 * @return the first_name
	 */
	public String getFirst_name() {
		return first_name;
	}


	/**
	 * @param first_name the first_name to set
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	/**
	 * @return the middle_name
	 */
	public String getMiddle_name() {
		return middle_name;
	}


	/**
	 * @param middle_name the middle_name to set
	 */
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}


	/**
	 * @return the last_name
	 */
	public String getLast_name() {
		return last_name;
	}


	/**
	 * @param last_name the last_name to set
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}


	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}


	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}


	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}


	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}


	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}


	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}


	/**
	 * @return the zip_code
	 */
	public String getZip_code() {
		return zip_code;
	}


	/**
	 * @param zip_code the zip_code to set
	 */
	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
	
	/**
	 * @return the admin
	 */
	public boolean isAdmin() {
		return admin;
	}


	/**
	 * @param admin the admin to set
	 */
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	


	public String username;
	public String first_name;
	public String middle_name;
	public String last_name;
	public String email;
	public String password;
	public String phone;
	public String address;
	public String city;
	public String country;
	public String zip_code;
	public boolean admin;
	
	public customer() {
		this.customer_id=0;
		this.username="";
		this.first_name="";
		this.middle_name="";
		this.last_name="";
		this.email="";
		this.password="";
		this.phone="";
		this.address="";
		this.city="";
		this.country="";
		this.zip_code="";
		this.admin=false;
	}
		
		
		public customer(int customer_id, String username, String first_name, String middle_name, String last_name,
				String email,
				String password, String phone, String address, String city, String country, String zip_code, boolean admin
				) {
			
			
			this.customer_id=customer_id;
			this.username=username;
			this.first_name=first_name;
			this.middle_name=middle_name;
			this.last_name=last_name;
			this.email=email;
			this.password=password;
			this.phone=phone;
			this.address=address;
			this.city=city;
			this.country=country;
			this.zip_code=zip_code;
			this.admin=admin;
		}
		
		
		
		
	}
	
	
	
	
	

