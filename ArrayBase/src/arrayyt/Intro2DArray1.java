package arrayyt;

public class Intro2DArray1 {

	public static void main(String[] args) {
		int[][] a = { { 10, 20, 30 }, { 40, 50 } };
		System.out.println(a); // class print hash value generate automatic by compiler....
		System.out.println(a[0]); // same print any hash value
		System.out.println(a[1]); // same print any hash value
		System.out.println(a[0][0]); // print located value
		System.out.println(a.length); // lengh of array is 2

		int[][] b = new int[2][];
		System.out.println(b);
		System.out.println(b[0]); // print null because array is empty
		System.out.println(b[1]); // print null because array is empty
		System.out.println(b[0][0]); // runtimeexception becuase that location is not exists with value
		System.out.println(b.length); // print lenght that is 2S
		System.out.println(b[0].length); // again error because there is no length of that location
	}

}
