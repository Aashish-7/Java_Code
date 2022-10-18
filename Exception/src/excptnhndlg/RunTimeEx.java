package excptnhndlg;

public class RunTimeEx {

	@SuppressWarnings("null")

	public static void main(String[] args) {
		try {
			int a = 100, b = 0, c;
			c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			String name = null;
			System.out.println(name.length());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
// without try-catch entire program will be compile normally 
// no need to use try catch because that is run time exception compiler no need to alert you  