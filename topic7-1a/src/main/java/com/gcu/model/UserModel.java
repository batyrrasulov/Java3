package com.gcu.model;

public class UserModel {
	private String id;
	private String username;
	private String password;
	
	public UserModel() {
		this.id = "";
		this.username = "";
		this.password = "";
	}
	public UserModel(String id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}

}
