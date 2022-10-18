package strngprgm;

public class Concat {
	public static void main(String[] args) {
		String s1=  "Aashish";
		String s2 = "Prajapati";

		
		System.out.println(s1+" "+s2);
		System.out.println(s1.concat(s2));
		System.out.println(s1+10);
		System.out.println(s1+10+20);
		System.out.println(10+20+s1);
		System.out.println(10+s1+20);
		System.out.println(s1+20/10);
		//System.out.println(s1+10-5); error according to BODMAS
	}

}
