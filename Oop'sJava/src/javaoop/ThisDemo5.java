package javaoop;

class ThisDemo6 {
	public ThisDemo6 m1() {
		// TODO Auto-generated constructor stub
		System.out.println("Hua kuch return ya nhi......");
		return this;
	}
}

public class ThisDemo5 {
	public static void main(String[] args) {
		ThisDemo6 td6 = new ThisDemo6();
		td6.m1();
	}
}
