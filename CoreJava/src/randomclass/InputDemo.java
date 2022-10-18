import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner num = new Scanner(System.in);
		System.out.println("Enter Two  No :");
		int a = num.nextInt();
		int b = num.nextInt();
		int c = a+b;
		System.out.println("Sum of two no are :" +c);
	}

}
