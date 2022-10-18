package arrayyt;

public class AnonymousArray {

	public static void main(String[] args) {

		AnonymousArray.sum(new int[] { 10, 20, 30 }); // only one time used than end, no name 1D, 2D, 3D any of them
	}

	static void sum(int[] no) {
		int total = 0;
		for (int i : no) {
			total = total + i;
		}
		System.out.println(total);
	}
}
