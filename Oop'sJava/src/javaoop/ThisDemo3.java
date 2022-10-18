package javaoop;

class ThisDem2 {
	void m1(ThisDem2 td) {
		System.out.println("I am in m1 method....");
	}

	void m2() {
		m1(this);
	}
}

public class ThisDemo3 {
	public static void main(String[] args) {
		ThisDem2 td2 = new ThisDem2();
		td2.m2();
	}
}
