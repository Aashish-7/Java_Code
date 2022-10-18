package javaoop;

public class OverLoad5 {

	void show(int a, float b) {
		System.out.println("int float method");
	}

	void show(float a, int b) {
		System.out.println("float int method");
	}

	void show(String a, float b) {
		System.out.println("String float method");
	}

	public static void main(String[] args) {
		OverLoad5 ol = new OverLoad5();
		ol.show(10, 20.5f);
		ol.show(10.4f, 11);
		// ol.show(11, 21); //// automatic promotion fail if int int is same
		ol.show("abc", 10.5f);
		ol.show("abcd", 20); // automatic promotion on int to float
		ol.show("abcd", 15.2f);
	}

}
