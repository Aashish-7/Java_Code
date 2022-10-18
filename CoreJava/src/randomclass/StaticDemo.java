
public class StaticDemo {

	static {
		System.out.println("Static block 1....");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am main method ");
	}
	static {
		System.out.println("Static block 2.....");
	}

}
