

import java.io.IOException;
import java.util.Scanner;

public class ExecuteProject {

	public static void main(String args[]) {
		String ch = null;
		boolean isLoggedIn = false;
		do {
			System.out.println("\n\n*********MENU************\n");
			System.out.println("1. Register User");
			System.out.println("2. Login User");
			System.out.println("3. Upload Excel File");
			System.out.println("4. Exit");
			System.out.println("*****************************\n");

			System.out.println("\nEnter your choice...:\t");

			Scanner s2 = new Scanner(System.in);
			ch = s2.nextLine();

			switch (ch) {
			case "1": // Registration User
				new Registration().entry();
				break;
			case "2":
				// Login User
				Login log = new Login();
				isLoggedIn = log.login();
				break;
			case "3":
				if (isLoggedIn) {
					System.out.println("Enter file name to read :\t");
					Scanner s1 = new Scanner(System.in);
					String fileName = s1.next();
					try {
						ReadExcelFile file = new ReadExcelFile(fileName);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					System.out.println("Please login first...!!!");
				}
				break;
			case "4":
				System.out.println("Exited.......!!!\n");

				return;
			default:
				System.out.println("Wrong inuput provided.");

			}

		} while (ch != "4");

	}

}
