package excptnhndlg;

public class ThrowKey {

	void divide() {
		try {
			int a = 100, b = 0, c;
			c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		ThrowKey tk = new ThrowKey();
		tk.divide(); // here try catch possible but upper case is better compare it.
		System.out.println("Check run or not ");
	}

}
