package com.coforge.oops;

//constructor //this--used for representing current class properties(var,method,object,constructor), super-->
public class ConstructorEx {
	int a=123;
	public ConstructorEx() {
		System.out.println("am from default constructor");
	}
	public ConstructorEx(String name) {
		System.out.println("am from param constructor");
	}
	public void displayMessage() {
		System.out.println("welcome to constructor example");
	}
	// ctrl+/ ,ctrl+shift+/ ,ctrl+shift+\,ctrl+shift+O,ctrl+space,ctrl+shift+f

	public static void main(String[] args) {

		ConstructorEx obj = new ConstructorEx("time for breakfast");
		ConstructorEx obj1 = new ConstructorEx();
		obj.displayMessage();

	}

}
