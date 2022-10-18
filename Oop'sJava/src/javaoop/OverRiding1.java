package javaoop;

abstract class Xyz {
	abstract void show2();

	void display() throws RuntimeException {
		System.out.println("1...");
	}
}

public class OverRiding1 extends Xyz {
	void show2() {
		super.display();
		System.out.println("2..");

	}

	public static void main(String[] args) {
		OverRiding1 or1 = new OverRiding1();
		or1.show2();
		or1.display();
	}
}
