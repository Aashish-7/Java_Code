package arrayyt;

public class SecondSmallest1 {

	public static void main(String[] args) {
		// with the help of integer range!!!
		int[] a = { 6, 8, 2, 4, 3, 1, 5, 7 };
		int minimum = Integer.MAX_VALUE;
		int second_minimum = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < minimum) {
				second_minimum = minimum;
				minimum = a[i];
			} else if (a[i] < second_minimum && a[i] != minimum) {
				second_minimum = a[i];
			}
		}
		if (second_minimum == Integer.MAX_VALUE) {
			System.out.println("No second minimum");
		} else {
			System.out.println(second_minimum);
		}
	}
}
