package javaoop;

public class OverLoad6 {

	void show(int a) {
		System.out.println("int method");
	}

	void show(int... a) {
		System.out.println("Varags method "); // contain empty and many value but same data type
	}

	public static void main(String[] args) {
		OverLoad6 ol = new OverLoad6();
		ol.show(12);
		ol.show(); // contain no arguments method
		ol.show(12, 21, 212, 33); // contain many no of arguments
	}
}
