package arrayyt;

public class TrawersingWay1 {

	public static void main(String[] args) {
		// 1.for loop , 2. for-each loop , 3. while loop , 4. do while loop

		int[] a = { 10, 20, 30 };
		int i = 0;
		while (i < a.length) {
			System.out.print(a[i] + " ");
			i++;
		}
		System.out.println();

		int[] b = { 10, 20, 30, 40, 50 };
		int j = 0;
		do {
			System.out.print(b[j] + " ");
			j++;
		} while (j < b.length);

	}
}
