import java.util.Scanner;

public class UserInput {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter Username :");

		String username = myObj.nextLine();
		System.out.println("Username is : " + username);
	}

}
