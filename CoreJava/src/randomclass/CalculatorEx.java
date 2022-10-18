package com.coforge.basic;

public class CalculatorEx {// ctrl+shift+F
	int age = 28;
	static float salary = 23.6f;//global & static 
	int add(int a, int b) {// public,private,protected,default
		return a + b;
	}
	static void sub(int a, int b) {
		System.out.println(a - b);
	}
	void mul() {// default method
		int a = 123;
		int b = 124;
		System.out.println(a * b);
	}
	int div() {// default method
		int a = 12;
		int b = 4;
		return a / b;
	}
	public static void main(String[] args) {//jvm
		System.out.println(CalculatorEx.salary);
		CalculatorEx obj=new CalculatorEx();
		System.out.println(obj.age);
		CalculatorEx.sub(123,120);
		System.out.println(obj.add(12,13));
		obj.mul();
		System.out.println(obj.div());
	}
}
