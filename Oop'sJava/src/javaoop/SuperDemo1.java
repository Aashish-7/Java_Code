package javaoop;

class A1 {
	void m1() {
		System.out.println("I am in class A1..");
	}
}

class B1 extends A1 {
	void show() {
		super.m1();
	}
}

public class SuperDemo1 {
	public static void main(String[] args) {
		B1 ob = new B1();
		ob.show();
	}
}
