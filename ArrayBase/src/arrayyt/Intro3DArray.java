package arrayyt;

public class Intro3DArray {

	public static void main(String[] args) {
		// creation of 3D Array that is

		int[][][] a;
		a = new int[2][][];
		a[0] = new int[2][];
		a[0][0] = new int[2];
		a[0][1] = new int[2];

		a[1] = new int[2][];
		a[1][0] = new int[2];
		a[1][1] = new int[2];

		// declaration and ceation insingle line
		int[][][] b = new int[2][3][2]; // 0 1 , 0 1 2 , 0 1
		System.out.println(b); // print hash value
	}

}
