import java.util.Scanner;

public class SwitchDemo2 {

	public static void checkNum(int n) {
		if (n % 2 == 0) {
			System.out.println("Even No.");
		} else {
			System.out.println("Odd No.");
		}
	}

	public static void greaterNum(int a, int b) {
		if (a > b) {
			System.out.println("First no is greater.");
		} else if (a == b) {
			System.out.println("Both are equal.");
		} else {
			System.out.println("Second no is greater");
		}
	}

	public static void swapNum(int a, int b) {
		System.out.println("Before swapping are : " + a + " " + b);
		int c = a;
		a = b;
		b = c;
		System.out.println("After swapping are : " + a + " " + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Main Menu.");
		System.out.println("1. Odd/Even.");
		System.out.println("2. Greater in two no.");
		System.out.println("3. swapping of two no.");
		System.out.println("4. exit.");
		System.out.println("Enter Your Choice.");

		int choice = s1.nextInt();

		switch (choice) {

		case 1:
			System.out.println("Enter any no");

			int num = s1.nextInt();
			checkNum(num);
			break;

		case 2:
			System.out.println("enter two no");
			int a = s1.nextInt();
			int b = s1.nextInt();
			greaterNum(a, b);
			break;

		case 3:
			System.out.println("Enter Two no");
			a = s1.nextInt();
			b = s1.nextInt();
			swapNum(a, b);
			break;

		case 4:
			System.exit(0);
			break;

		default:
			System.out.println("Invalid choice");
		}
	}

}
