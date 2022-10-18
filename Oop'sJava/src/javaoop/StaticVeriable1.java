package javaoop; // Static variable used for memory management

class Employeee {
	int empid;
	String name;
	static String company = "SP";

	public Employeee(int empid, String name) {// String company
		// TODO Auto-generated constructor stub
		this.empid = empid;
		this.name = name;
		// this.Company=company;
	}

	void display() {
		System.out.println(empid + " " + name + " " + company);
	}
}

public class StaticVeriable1 {

	public static void main(String[] args) {
		Employeee e1 = new Employeee(101, "amit");
		e1.display();
		Employeee e2 = new Employeee(102, "Aashsih");
		e2.display();
	}

}
