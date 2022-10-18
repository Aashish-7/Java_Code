package javaoop;

class Test2 {
	synchronized void show3() {
		System.out.println("11");
	}
}

public class OverRiding3 extends Test2 {
	void show3() {
		super.show3();
		System.out.println("22");
	}

	public static void main(String[] args) {
		OverRiding3 oo = new OverRiding3();
		oo.show3();
		Test2 t = new Test2();
		t.show3();
	}

}
