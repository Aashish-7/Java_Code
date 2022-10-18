package javaoop;

public class Animal1 { // Initialize object by using reference variable....

	String color;
	int age;

	public static void main(String[] args) {
		Animal1 am = new Animal1();
		am.color = "black";
		am.age = 13;
		System.out.println("color is :" + am.color + " age is :" + am.age);
	}

}
