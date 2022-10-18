package com.coforge.oops;

// by default package for every file java.lang
// by default parent class for every java class Object 

import java.util.Date;
class SuperParent
{
	String displayWelcome()// ctrl+shift+o
	{
		return "welcome to inheritance";
	}

}
class Parent extends SuperParent{

	Date displayDate()// ctrl+shift+o
	{
		Date date = new Date();
		return date;
	}

	String displayTime()// ctrl+shift+o
	{
		Date date = new Date();
		return date.getHours() + ":" + date.getMinutes();

	}

}

public class Child extends Parent {
	public void displayMsg() {
		System.out.println("Am from Child class");
	}

	public void display() {
		System.out.println("leave us its breakfast time");
	}

	public static void main(String[] args) {
		Child child = new Child();
		child.displayMsg();
		System.out.println(child.displayTime());
		System.out.println(child.displayDate());
		child.display();
		child.displayMsg();
		System.out.println(child.displayWelcome());

		
	}

}// java Child
