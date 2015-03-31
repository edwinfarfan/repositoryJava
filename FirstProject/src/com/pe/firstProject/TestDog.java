package com.pe.firstProject;

public class TestDog {

	public static void main(String[] args) {
		Animal a = new Animal(); 
		Animal b = new Dog(); 

		a.move();// runs the method in Animal class

		b.move();// Runs the method in Dog class
	}

}

class Animal {

	public void move() {
		System.out.println("Animals can move");
	}
}

class Dog extends Animal {

	public void move() {
		System.out.println("Dogs can walk and run");
	}
}