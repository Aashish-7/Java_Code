package excptnhndlg;

public class PrintExceptionWay {

	public static void main(String[] args) {

		try {
			int a = 100, b = 0, c;
			c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace(); // print exception name, descreption and location or line of the error
			System.out.println();
			System.out.println(e); // only print exception and descrption(messege)
			System.out.println();
			System.out.println(e.getMessage()); /// print only descreption or messege
		}

	}

}
