package javaoop;

class ThisDem1 {
	public ThisDem1() {
		// TODO Auto-generated constructor stub
		System.out.println("No arguments constructor!!");
	}

	ThisDem1(int a) {
		this();
		System.out.println("Para..... constructor!!");
	}
}

public class ThisDemo2 {
	public static void main(String[] args) {
		new ThisDem1(10); // no need to use as a object creation directly we can use !!!!
	}
}
