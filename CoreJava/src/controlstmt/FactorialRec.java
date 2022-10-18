package controlstmt;

import java.util.Scanner;

public class FactorialRec {
	static int fact = 1;

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.");
		int no = sc.nextInt();
		FactorialRec ob = new FactorialRec();
		ob.calcFact(no);
		System.out.println("factorial of " + no + " is " + fact);
	}

	void calcFact(int no) {
		if (no >= 1) {
			fact = fact * no;
			calcFact(no - 1);
		}
	}
}
