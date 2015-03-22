package com.pe.firstProject;

import com.pe.util.P;

public class HelloworldBean {

	String message = "Hello World!!!";

	public HelloworldBean() {
		setMessage( "Welcome to java world...");
		
	}

	public static void main(String[] args) {

		HelloworldBean hw = new HelloworldBean();
		P.rintln(hw.getMessage());

	}

	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

}
