package com.pe.firstProject;

import com.pe.util.P;

public class HelloworldInterface implements simplyInterface{
	
	public static void main(String[] args) {
		
		HelloworldInterface hw = new HelloworldInterface();
		 
		P.rintln(hw.getMessage());
		
	}

	public  String  getMessage(){
		return message;
	}
	
}


interface simplyInterface {
	
	String message="Hello World!!!";
	
	public String  getMessage();
}