package javaoop;

class StaticDemo {
	static int i = 10; // static method access only static data like i

	static void dis() {
		System.out.println(i);
	}
}

public class StaticMethod1 {
	public static void main(String[] args) {

		StaticDemo.dis(); // no need to make object
	}
}
