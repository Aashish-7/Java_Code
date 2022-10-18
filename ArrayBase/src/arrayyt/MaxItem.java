package arrayyt;

public class MaxItem {

	public static void main(String[] args) {
		int[] a = { 2, 6, 78, 90, 4, 5, 1, 2, 10 };
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("Max item is " + max);
	}

}
