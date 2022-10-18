package javaoop;

class Test11 {
	public Test11(ThisDemo51 td5) {
		// TODO Auto-generated constructor stub
		System.out.println("Test class constructor");
	}
}

class ThisDemo51 {
	void m1() {
		// Test11 t =
		new Test11(this);
	}
}

public class ThisDemo4 {
	public static void main(String[] args) {
		ThisDemo51 td = new ThisDemo51();
		td.m1();
	}
}
