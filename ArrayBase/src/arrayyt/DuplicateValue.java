package arrayyt; // BRUTE FORCE METHOD( FOR MARE THAN 2 VALUE ITS NOT USEFUL CONFUSED..)

public class DuplicateValue {

	public static void main(String[] args) {
		int[] a = { 3, 5, 4, 3, 2, 2, 1 };
		System.out.println("Duplicate elements!!");
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j] && i != j) {
					System.out.print(a[i] + " ");
				}
			}
		}
	}

}
