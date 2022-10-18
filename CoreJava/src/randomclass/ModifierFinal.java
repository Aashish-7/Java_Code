///final	Attributes and methods cannot be overridden/modified
//If you don't want the ability to override existing attribute values, declare attributes as final:


public class ModifierFinal {
  final int x = 10;
  final double PI = 3.14;

  public static void main(String[] args) {
    ModifierFinal myObj = new ModifierFinal();
//  myObj.x = 50; // will generate an error: cannot assign a value to a final variable
//  myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
  }
}