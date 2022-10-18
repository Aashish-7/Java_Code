import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);

		int x[] = new int[5];
		int s = 0;

		System.out.println("Enter array element :");

		for (int i = 0; i < x.length; i++) {
			x[i] = s1.nextInt();
			s += x[i];
		}
		System.out.println("Sum of all elemet in array : " + s);
		System.out.println(x.length);
	}

}

//Syntax in Array

// int x[] = new int[y]; OR
// int []x = new int[y]; OR
// int[] x = new int[y]; . . . .. . ......