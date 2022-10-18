import java.util.Scanner;

public class ArrayDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[][] = new int[5][];
		x[0] = new int[3];
		x[1] = new int[4];
		x[2] = new int[2];
		x[3] = new int[5];
		x[4] = new int[4];

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Jagged Matrix :");
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				x[i][j] = s1.nextInt();
			}
		}
		System.out.println("Jagged Matrix Is :");
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.println(x[i][j] + " ");
			}
			System.out.println();
		}
	}

}

// Jagged Matrix in java 
