package strngprgm;

public class StringBufferDemo1 {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Aashish");
		sb.append("Aashish Kumar");
		System.out.println(sb.capacity());
		sb.append("Prajapati");
		System.out.println(sb.capacity());
		
		System.out.println(sb.length());
		
		StringBuffer sb1 = new  StringBuffer("Aashish");
		sb1.append("Kumar");
		System.out.println(sb1);
		
		System.out.println(sb1.charAt(3));
		System.out.println(sb1.deleteCharAt(3));
		//System.out.println(sb1.deleteCharAt(2,4));
		
		System.out.println(sb.equals(sb1)); // O/P is false because this .equals method is from object class it is not work as string class where .equals check only content that is check both are refers to one variable 
		
		StringBuffer sb2 = sb1.append("Hii after check equals!!");
		System.out.println(sb2.equals(sb1)); // now it is provide true value!!
		
		System.out.println(sb1.indexOf("a"));
		
		System.out.println(sb1.lastIndexOf("s"));
		
		System.out.println(sb1.insert(2, "q"));
		
		System.out.println(sb.replace(3, 6, "fuck"));
		
		System.out.println(sb.reverse());
		
		System.out.println(sb.subSequence(3, 7));
		
		System.out.println(sb.substring(3));
		
		System.out.println(sb.substring(3, 7));
		
	}
}
