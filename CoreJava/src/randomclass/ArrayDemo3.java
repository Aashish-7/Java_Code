import java.util.Scanner;

public class ArrayDemo3 {
	public static void main(String[] args) {
		int x[] = new int[5];
		int f = 0;

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter array element.....");
		for (int i = 0; i < x.length; i++) {
			x[i] = s1.nextInt();
		}
		System.out.println("Enter element to be search....");
		int ele = s1.nextInt();

		for (int i = 0; i < x.length; i++) {
			if (x[i] == ele) {
				f = 1;
				break;
			}
		}
		if (f == 0)
			System.out.println("Element no exit");
		else
			System.out.println("Exists");
	}
}
