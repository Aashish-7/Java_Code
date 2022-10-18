package javaoop;

public class Animal2 { // Initialize object by using methods......
	String color;
	int age;

	void initObj(String c, int a) {
		color = c;
		age = a;
	}

	void display() {
		System.out.println(color + " " + age);
	}

	public static void main(String[] args) {
		Animal2 am = new Animal2();
		am.initObj("black", 10);
		am.display();
	}

}
