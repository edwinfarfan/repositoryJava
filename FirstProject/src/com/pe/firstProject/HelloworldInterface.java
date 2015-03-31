package com.pe.firstProject;

import com.pe.util.Imprime;

public class HelloworldInterface implements SimplyInterface{
	
	public static void main(String[] args) {
		
		HelloworldInterface hw = new HelloworldInterface();
		 
		Imprime.linea(hw.getMessage());
		
	}

	public  String  getMessage(){
		return message;
	}
	
}


interface SimplyInterface {
	
	String message="Hello World!!!";
	
	public String  getMessage();
}