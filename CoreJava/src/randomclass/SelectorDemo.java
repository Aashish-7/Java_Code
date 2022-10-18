
public class SelectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;

		// if (true)
		// System.out.println("hello");

		// if (false)
		// System.out.println("bye");

		// if(n%2==0)
		// System.out.println("Even");

		// if(n%2!=0)
		// else
		// System.out.println("Odd");

		if (n == 0)
			System.out.println("Nothing No is zero");
		else if (n % 2 == 0)
			System.out.println("No is even");
		else
			System.out.println("no is odd");

		// in if statement if more than one statement use { }

		// Ternary operator
		// Variable = expression 1? expression 2 : expression 3
		// ? : -> condition ? expression 1 : expression 2

		int i = 8;
		int j = 0;

		// if(i>6)
		// j=2;
		// else
		// j=4;
		j = i > 6 ? 1 : 2;
		System.out.println(j);

		// switch operator

		int m = 4;
		switch (m) {

		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		default:
			System.out.println("error");

		}
	}

}
