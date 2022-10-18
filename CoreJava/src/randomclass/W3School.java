
public class W3School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f1 = 35e3f;
		double d1 = 12E4d;
		System.out.println(f1);
		System.out.println(d1);
		char myGrade = 'B';
		System.out.println(myGrade);
		char myVar1 = 65, myVar2 = 66, myVar3 = 67;
		System.out.println(myVar1);
		System.out.println(myVar2);
		System.out.println(myVar3);

		int myInt = 9;
		double myDouble = myInt; // Automatic casting: int to double

		System.out.println(myInt); // Outputs 9
		System.out.println(myDouble); // Outputs 9.0

		double myDouble1 = 9.78d;
		int myInt1 = (int) myDouble; // Manual casting: double to int

		System.out.println(myDouble1); // Outputs 9.78
		System.out.println(myInt1); // Outputs 9

		String txt1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txt1.length());

		String txt = "Hello World";
		System.out.println(txt.toUpperCase()); // Outputs "HELLO WORLD"
		System.out.println(txt.toLowerCase()); // Outputs "hello world"

		String txt2 = "Please locate \f where \"locate\" occurs!";
		// System.out.println(txt2.indexOf("locate")); // Outputs 7
		System.out.println(txt2);
		String firstName = "John";
		String lastName = "Doe";
		System.out.println(firstName + " " + lastName);

		String fName = "John ";
		String lName = "Doe";
		System.out.println(fName.concat(lName));

		String x = "10";
		String y = "20";
		String z = x + y; // z will be 1020 (a String)
		System.out.println(z);

		// int abs=5;
		// Math.abs(abs);
		// System.out.println(abs);

		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun); // Outputs true
		System.out.println(isFishTasty); // Outputs false

		int d = 10;
		System.out.println(d == 10);

		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;

		}

		int j = 0;
		do {
			System.out.println(j);
			j++;
		} while (j < 5);

		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		for (String s : cars) {
			System.out.println(s);
		}

		for (int p = 0; p < 10; p++) {
			if (p == 4) {
				break;
			}
			System.out.println(p);
		}

		for (int q = 0; q < 10; q++) {
			if (q == 4) {
				continue;
			}
			System.out.println(q);
		}

		// You can also use break and continue in while loops:

		int w = 0;
		while (w < 10) {
			System.out.println(w);
			w++;
			if (w == 4) {
				break;
			}
		}

		int r = 0;
		while (r < 10) {
			if (r == 4) {
				r++;
				continue;
			}
			System.out.println(r);
			r++;
		}

	}
}
