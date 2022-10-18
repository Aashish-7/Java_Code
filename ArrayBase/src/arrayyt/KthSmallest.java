package arrayyt;

public class KthSmallest {

	public static void main(String[] args) {
		int[] a = { 5, 8, 12, 7, 6, 2, 4, 3, 1 };
		int k = 5;
		for (int i = 0; i < a.length - 1; i++) { // -1 in length for handle exception because j is start i+1
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			if (i == k - 1) {
				System.out.println(a[i]);
				break;
			}
		}
	}

}
