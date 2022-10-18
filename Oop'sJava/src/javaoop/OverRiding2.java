package javaoop;

class Test1 {
	void show() {
		System.out.println("1...");
	}
}

public class OverRiding2 extends Test1 {

	void show() {
		super.show(); // with the help of super keywprd we can call parent class method..
		System.out.println("2...");
	}

	public static void main(String[] args) {
		OverRiding2 o = new OverRiding2();
		o.show();
	}
}
