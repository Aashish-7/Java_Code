package javayt;

public class Variables {

	int a = 10;
	static int b = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variables ob1 = new Variables();
		System.out.println(ob1.a);
		System.out.println(b);

		ob1.a = 1000;
		Variables.b = 2000;

		System.out.println(ob1.a);
		System.out.println(Variables.b);

		Variables ob2 = new Variables();
		System.out.println(ob2.a);
		System.out.println(Variables.b);

	}

}
