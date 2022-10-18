package javaoop;

class A2 {
	public A2() {
		// TODO Auto-generated constructor stub
		System.out.println("I am in class A2");
	}
}

class B2 extends A2 {
	public B2() {
		// TODO Auto-generated constructor stub
		super(); // this super is add by compiler automatic
		System.out.println("I am in class B2");
	}
}

public class SuperDemo2 {
	public static void main(String[] args) {
		// B2 b2 =
		new B2();
	}
}
