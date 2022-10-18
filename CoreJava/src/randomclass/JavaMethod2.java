
public class JavaMethod2 {
	static int mymethod(int x) {
		// System.out.println(x);
		return 5 + x;

	}

	static int addmethod(int y, int z) {
		return y + z;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mymethod(3));
		// mymethod(4);
		int a = addmethod(3, 4);
		System.out.println(a);
		System.out.println(addmethod(4, 4));
	}

}
