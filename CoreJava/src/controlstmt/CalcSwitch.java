package controlstmt;

import java.util.Scanner;

public class CalcSwitch {

	public static void main(String[] args) {

		String yn;
		do {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first no.");
			int no1 = sc.nextInt();
			System.out.println("Entere second no.");
			int no2 = sc.nextInt();
			System.out.println("Select symbol (+,-,*,/)");
			String sym = sc.next();
			int res;
			switch (sym) {
			case "+":
				res = no1 + no2;
				System.out.println("Addition is: " + res);
				break;
			case "-":
				res = no1 - no2;
				System.out.println("Sustraction is: " + res);
				break;
			case "*":
				res = no1 * no2;
				System.out.println("Multiplicstion is: " + res);
				break;
			case "/":
				res = no1 / no2;
				System.out.println("Division is: " + res);
				break;
			default:
				System.out.println("Invalid input..");
				break;
			}
			System.out.println("Do you want to continue (Press y for yes n for no.)");

			yn = sc.next();

		} while (yn.equals("y") || yn.equals("Y"));
	}

}
