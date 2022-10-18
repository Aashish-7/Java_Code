package excptnhndlg;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 100, b = 2, c;                // try with b = 0  , finally always execute 
			c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("I am in finlly block....");
		}
	}

}
