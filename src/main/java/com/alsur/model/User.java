package com.alsur.model;

import java.io.Serializable;


public class User implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8456794455438447065L;
	
	private String userName;
	private String email;
	private String firstName;
	private String lastName;
	
	
	
	
	public User(String userName, String email, String firstName, String lastName) {
		super();
		this.userName = userName;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public String getEmail() {
		return email;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
	
}
