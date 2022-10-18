
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] car = { "Volvo", "BMW", "Ford", "Mazda" };
		car[0] = "Opel";
		System.out.println(car[0]);
		System.out.println(car.length);

		for (int c = 0; c < car.length; c++) {
			System.out.println(car[c]);
		}

		for (String e : car) {
			System.out.println(e);
		}

		int[][] myNumber = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
		int p = myNumber[1][2];
		System.out.println(p); // Outputs 7

		int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
		for (int i = 0; i < myNumbers.length; ++i) {
			for (int j = 0; j < myNumbers[i].length; ++j) {
				System.out.println(myNumbers[i][j]);
			}
		}
		
		
	}

}
