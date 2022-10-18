package javayt;

public class Variables2 {

	int a = 10;
	static int b = 20;

	void add() {
		int c = 30, d;
		d = a + b + c;
		System.out.println(d);
	}

	void mul() {
		int e = 40, f;
		f = a * b * e;
		System.out.println(f);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variables2 ob1 = new Variables2();
		ob1.add();
		ob1.mul();

	}

}
