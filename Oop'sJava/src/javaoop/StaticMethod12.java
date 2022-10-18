package javaoop;

class StatDemo {
	static void disp() {
		show();
		System.out.println("123");
	}

	static void show() { // only call static method like show() in upper level
		System.out.println("1234");
	}
}

public class StaticMethod12 {
	public static void main(String[] args) {
		StatDemo.disp();
	}
}
