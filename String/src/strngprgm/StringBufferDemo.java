package strngprgm;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());

		StringBuffer sb1 = new StringBuffer("Aashish");
		System.out.println(sb1.capacity());

		StringBuffer sb2 = new StringBuffer(1000);
		System.out.println(sb2.capacity());

		StringBuffer sb3 = new StringBuffer("Aashish Kumar");
		System.out.println(sb3.capacity());
	}
} // all four constructor in StringBuffer class