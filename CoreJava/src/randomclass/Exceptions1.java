
public class Exceptions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] myNumber = { 1, 3, 2, 4 };
			System.out.println(myNumber[9]);
		} catch (Exception e) {
			System.out.println("Somthing went wrong...");
		}
	}

}
