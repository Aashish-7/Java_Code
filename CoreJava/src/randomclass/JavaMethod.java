
public class JavaMethod {
	static void myMethod() {
		System.out.println("Try to call method form main class");
		// System.out.println("All action perform which is belong from method");
		// System.out.println("A method can also be use multiple times");
	}

	static void nameMethod(String fname) {
		System.out.println(fname + " Engineering Students");
	}

	static void agemethod(String name, int age) {
		System.out.println(name + " is " + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMethod();
		myMethod();
		myMethod();
		nameMethod("Aashish");
		nameMethod("Shivam");
		nameMethod("Aman");
		nameMethod("Bittu");
		agemethod("Aashish", 22);
		agemethod("Shivam", 21);
	}

}
