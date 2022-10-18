import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner swe = new Scanner(System.in);
		System.out.println("Main Menu");
		System.out.println("1.Odd/Even");
		System.out.println("2.Greater In two No");
		System.out.println("3.Swapping of two No");
		System.out.println("4.Addition of two No");
		System.out.println("5.Substraction of two No");
		System.out.println("6.Exit");
		System.out.println("Enter your choice");
		int choice = swe.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Enter no for check odd/even : ");
			int num = swe.nextInt();
			if (num % 2 == 0)
				System.out.println("No is Even : ");
			else
				System.out.println("No is Odd : ");
			break;

		case 2:
			System.out.println("Enter Two no for check which is great : ");
			int a = swe.nextInt();
			int b = swe.nextInt();
			if (a > b)
				System.out.println("First no is greater..");
			else if (a < b)
				System.out.println("second no is greater..");
			else
				System.out.println("both are equal no..");
			break;

		case 3:
			System.out.println("Enter two no for swapping : ");
			a = swe.nextInt();
			b = swe.nextInt();
			System.out.println("No before swapping are " + a + " " + b);

			int c = a;
			a = b;
			b = c;
			System.out.println("No after swapping are  " + a + " " + b);
			break;

		case 4:
			System.out.println("Enter Two no for Addition :");
			a = swe.nextInt();
			b = swe.nextInt();
			c = a + b;
			System.out.println("Addition of Two no " + c);
			break;

		case 5:
			System.out.println("Enter Two no for Substraction :");
			a = swe.nextInt();
			b = swe.nextInt();
			c = a - b;
			System.out.println("Substraction of Two no " + c);
			break;

		case 6:
			System.exit(0);
			break;

		default:
			System.out.println("Invalid Choice");
		}
	}

}
