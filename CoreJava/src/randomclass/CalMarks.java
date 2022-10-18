import java.util.Scanner;

public class CalMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner num1 = new Scanner(System.in);
		System.out.println("Enter your marks here :");

		int p = num1.nextInt();
		int c = num1.nextInt();
		int m = num1.nextInt();
		int h = num1.nextInt();
		int e = num1.nextInt();

		int tm = p + c + m + h + e;
		int avr = tm / 5;

		System.out.println("Total marks is : " + tm);
		System.out.println("Average marks is : " + avr);
		
	}

}
