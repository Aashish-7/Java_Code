package javaoop;

class Employee {
	private int emp_id;

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public int getEmp_id() {
		return emp_id;
	}
}

public class EncapsulationCompany {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmp_id(101);
		System.out.println(e.getEmp_id());
	}
}
