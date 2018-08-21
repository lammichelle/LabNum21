package com.grandcircus.coffeeshop.entity;

public class Users {
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String password;
	private String confirmPassword;
	
	public Users() {
		firstName ="";
		lastName = "";
		email = "";
		phone = "";
		password = "";
		confirmPassword = "";
				
	}
	
	
	
	public Users(String firstName, String lastName, String email, String phone, String password,
			String confirmPassword) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}



	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}



	@Override
	public String toString() {
		return "firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phone=" + phone
				+ ", password=" + password + ", confirmPassword=" + confirmPassword ;
	}
	
	
	
}
