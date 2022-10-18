
public class ModifiersJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*
 * We divide modifiers into two groups: --->Access Modifiers - controls the
 * access level Non-Access Modifiers - do not --->control access level, but
 * provides other functionality
 * 
 * ..........Access Modifiers......... 
 * ---->For classes, you can use either public or default:
 * ----> public : The class is accessible by any other class
 *   public class Main {
         public static void main(String[] args) {
             System.out.println("Hello World");
              }
            }

 * ----> default : The class is only accessible by classes in the same package. This is used when you don't specify a modifier
 *class MyClass {
  	public static void main(String[] args) {
    	System.out.println("Hello World");
  		}
	}

 * 
 * ----> For attributes, methods and constructors, you can use the one of the following:
 * -----> public : The code is accessible for all classes.	
 *     ex---> Main.java
 *   public class Main {
  		public String fname = "John";
  		public String lname = "Doe";
  		public String email = "john@doe.com";
  		public int age = 24;
}

    Second.java
    class Second {
  public static void main(String[] args) {
    Main myObj = new Main(); 
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
  }
}

 * -----> private : The code is only accessible within the declared class	
 *    Ex---->   
 *    public class Main {
  private String fname = "John";
  private String lname = "Doe";
  private String email = "john@doe.com";
  private int age = 24;
  
  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
  }
}

 * -----> default : The code is only accessible in the same package. This is used when you don't specify a modifier. 
 *   ex------>
 *   class Person {
  String fname = "John";
  String lname = "Doe";
  String email = "john@doe.com";
  int age = 24;
  
  public static void main(String[] args) {
    Person myObj = new Person();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
  }
}

 * -----> protected	: The code is accessible in the same package and subclasses.		
 *    ex-----> 
 *    class Person {
  protected String fname = "John";
  protected String lname = "Doe";
  protected String email = "john@doe.com";
  protected int age = 24;
}

class Student extends Person {
  private int graduationYear = 2018;
  public static void main(String[] args) {
    Student myObj = new Student();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
  }
}





.................Non-Access Modifiers...................
------>For classes, you can use either final or abstract:
            ----> final	The class cannot be inherited by other classes
            ex--->
            final class Vehicle {
  protected String brand = "Ford";
  public void honk() {
    System.out.println("Tuut, tuut!");
  }
}

class Main extends Vehicle {
  private String modelName = "Mustang";
  public static void main(String[] args) {
    Main myFastCar = new Main();
    myFastCar.honk();
    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
  }
}
 o/p is generate a error on compile time-->   Main.java:1: error: class Vehicle is public, should be declared in a file named Vehicle.java
public class Vehicle {
       ^
1 error




 */