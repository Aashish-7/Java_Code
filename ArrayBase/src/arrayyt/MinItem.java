package arrayyt;

public class MinItem {

	public static void main(String[] args) {
		int[] a = { 3, 5, 6, 8, 90, 9, 11, 23, 56, 43, 4 };
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("Min item is " + min);
	}

}
