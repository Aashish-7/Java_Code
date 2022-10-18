package arrayyt;

public class Intro3DArray1 {

	public static void main(String[] args) {
		int[][][] a = { { { 10, 20 }, { 30, 40 }, { 50, 60 } } };
		System.out.println(a); // hash value
		System.out.println(a[0]); // hash value
		System.out.println(a[0][0]); // again hash value

		System.out.println(a[0][0][0]); // print value that is 10
		System.out.println(a.length); // that is 1 (0 , 0 1 2 , 0 1, 0 1, 0 1)
		System.out.println(a[0].length); // that is 3
		System.out.println(a[0][0].length); // that is 2
	}

}
