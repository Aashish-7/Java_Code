package com.coforge.oops;

class ParentEx1 {
	static int a = 10;

	public ParentEx1() {
		this(111);
		System.out.println("dafault constructor of parent");
	
	}

	ParentEx1(int a) {
	
		System.out.println("Parent class parameterized constuructor" + a);
	}

	public void m1() {
		System.out.println("parent class method");
	}
	public void m1(String name) {
		System.out.println("parent class overloaded param method :"+name);
	}
}

class SuperEx extends ParentEx1 {
	static int a = 20;

	SuperEx() {
		//super();//parent class constructor calling ()
		super.m1();// parent method calling
		this.m1();// current class method calling
		System.out.println(this.a);// 20
		System.out.println(super.a);// 10
		System.out.println(this);// current class object
		System.out.println("child class constuructor");
	}

	public void m1() {
		System.out.println("child class method");
	}

	public static void main(String args[]) {
		SuperEx e = new SuperEx();// default constructor
		System.out.println(e);
		ParentEx1 p = new ParentEx1(12);// param constrcutor
	}
}