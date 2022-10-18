import java.util.Scanner;

public class ArrayDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[][] = new int[3][4];
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Matrix : ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				x[i][j] = s1.nextInt();
			}
		}
		System.out.println("Enter Matrix is \n");
		for (int i[] : x) {
			for (int j : i) {
				System.out.println(j + " ");
			}
			System.out.println();
		}
	}

}


// for=each loop with 2D array