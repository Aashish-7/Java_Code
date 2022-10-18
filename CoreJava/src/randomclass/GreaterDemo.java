import java.util.Scanner;

public class GreaterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner gre = new Scanner(System.in);
		System.out.println("Enter two no : ");
		int a = gre.nextInt();
		int b = gre.nextInt();

		if (a > b) {
			System.out.println("First no greater....");
		} else if (a == b) {
			System.out.println("Both are equal....");
		} else
			System.out.println("Second no greater....");
	}

}
