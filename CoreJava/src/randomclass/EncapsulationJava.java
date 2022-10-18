//public class EncapsulationJava {
//  private String name; // private = restricted access
//
//  // Getter
//  public String getName() {
//    return name;
//  }
//
//  // Setter
//  public void setName(String newName) {
//    this.name = newName;
//  }
//}

// Accessible without error from person.java

//public class Main {
//	  public static void main(String[] args) {
//	    Person myObj = new Person();
//	    myObj.setName("John"); // Set the value of the name variable to "John"
//	    System.out.println(myObj.getName());
//	  }
//	}
// 
//	// Outputs "John"


// generate error  

//public class Main {
//  public static void main(String[] args) {
//    Person myObj = new Person();
//    myObj.name = "John";  // error
//    System.out.println(myObj.name); // error 
//  }
//}