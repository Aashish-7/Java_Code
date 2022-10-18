package excptnhndlg;

import java.util.Scanner;

@SuppressWarnings("serial")
class YoungerAgeException extends RuntimeException {
	YoungerAgeException(String msg) {
		super(msg);
	}

	YoungerAgeException() {
		System.out.println("you are not eligible for voting");
	}
}

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub // if i am extends rumtine exception so we
		// don't need to use try catch or thorws in method
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your age for voting.");
		int a = sc.nextInt();
		if (a < 18) {
			throw new YoungerAgeException("better luck next time..");
		} else {
			System.out.println("Please vote.");
		}

	}

}
