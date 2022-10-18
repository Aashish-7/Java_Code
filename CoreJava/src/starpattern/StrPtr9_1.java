package starpattern;

public class StrPtr9_1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 9; k > (i * 2); k--) { // change k value 5,7,9
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
