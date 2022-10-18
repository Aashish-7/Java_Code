
public class RecursionJava {
	public static int sum(int k) {
		if(k>0) {
			return k+sum(k-1);
		}
		else {
			return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HI");
		System.out.println(sum(3));
		
	}
}

//int result = sum(5);
//System.out.println(result);
//}
//
//public static int sum(int k) {
//if (k > 0) {
//	return k + sum(k - 1);
//} else {
//	return 0;
//}