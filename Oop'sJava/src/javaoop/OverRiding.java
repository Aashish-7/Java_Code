package javaoop;

class Test {
	void show() {
		System.out.println("1!!");
	}
}

public class OverRiding extends Test {

	void show() {
		super.show();
		System.out.println("2!!");
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.show();
		OverRiding or = new OverRiding();
		or.show();

	}
}
