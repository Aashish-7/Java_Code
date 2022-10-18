package com.coforge.oops;

public class EmployeeClient {
public static void main(String[] args) {
	Employee emp=new Employee();
	
	emp.setEmpId(123);
	emp.setEmpName("mahesh");
	emp.setEmpAdd("delhi");
	
	
	
	System.out.println(emp.getEmpName()+" "+emp.getEmpAdd());
}
}
