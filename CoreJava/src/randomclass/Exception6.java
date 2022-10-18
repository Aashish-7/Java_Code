package com.cooforge.exceptions;//our class should extends exception,Throwable

//parameterized constructor
class AgeNotValidException extends Exception {
	private int age;

	public AgeNotValidException(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "you are not eligable for vote" + age;
	}
}

public class Exception6 {
	static void validation(int age) throws AgeNotValidException {
		if (age < 18)

			throw new AgeNotValidException(age);// MyException1 obj
		else
			System.out.println("you are eligable to vote");
	}

	public static void main(String args[]) throws AgeNotValidException  {

			Exception6.validation(16);
	
		System.out.println("rest of the code...");
	}
}