package com.coforge.oops;

class Calculator {

	public void add(float a, float b) {
		System.out.println("add of two float's : " + (a + b));
	}
	public void add(long a, long b) {
		System.out.println("add of two long's : " + (a + b));
	}


	public void add(int a, int b, int c) {
		System.out.println("add of three int's : " + (a + b + c));
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(12, 13);
		calc.add('a','b');//type promotion
	}
}