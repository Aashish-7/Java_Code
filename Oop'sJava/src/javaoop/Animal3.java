package javaoop;

public class Animal3 { // Initialize object by using constructor......
	String name;
	int emp_id;

	Animal3(String name, int emp_id) {
		this.name = name;
		this.emp_id = emp_id;

	}

	public static void main(String[] args) {
		Animal3 am = new Animal3("aashish", 22);
		Animal3 am1 = new Animal3("Aashu", 21);

		System.out.println(am.name + " " + am.emp_id);
		System.out.println(am1.emp_id + " " + am1.name);
	}

}
