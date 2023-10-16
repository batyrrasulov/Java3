package com.gcu.model;


public class LoginModel {
	// Variables
	// This should be a different import, but currently having issues 
	@jakarta.validation.constraints.NotNull(message="User name is a required field")
	@jakarta.validation.constraints.Size(min=1, max=32, message="User name must be between 1 and 32 characters")
	private String username;

	@jakarta.validation.constraints.NotNull(message="Password is a required field")
	@jakarta.validation.constraints.Size(min=1, max=32, message="Password must be between 1 and 32 characters")
	private String password;



public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}






}
