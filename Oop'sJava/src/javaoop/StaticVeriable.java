package javaoop; // static variable

class Test6 {
	static int a = 10;

	void m1() {
		// static int b = 20;
		// if try add static than error will be throw
	}
}

public class StaticVeriable {
	public static void main(String[] args) {
		System.out.println(Test6.a); // Directly access with test class not class object
	}
}
