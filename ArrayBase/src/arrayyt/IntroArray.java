package arrayyt;

public class IntroArray {

	public static void main(String[] args) {
		int emp_id[] = new int[10]; // 1000 emp_id store save location not one bye one
		emp_id[0] = 50;
		emp_id[1] = 60;
		emp_id[2] = 70;
		for (int i = 0; i <= emp_id.length; i++) {
			System.out.println(emp_id[i]);
		}
	}

}
