package javaoop;

class ThisDem {
	void display() {
		System.out.println("Hello");
	}

	void show4() {
		System.out.println("Try show is work or not!");
		display(); // here this keyword add by compiler automatic
	}
}

public class ThisDemo1 {
	public static void main(String[] args) {
		ThisDem td = new ThisDem();
		td.show4();
	}
}
