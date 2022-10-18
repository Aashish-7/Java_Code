// Static Inner Class
// An inner class can also be static, which means that you can access it without creating an object of the outer class:

class OuterClass2 {
  int x = 10;

  static class InnerClass {
    int y = 5;
  }
}

public class InnerClass2 {
  public static void main(String[] args) {
    OuterClass2.InnerClass myInner = new OuterClass2.InnerClass();
    System.out.println(myInner.y);
  }
}

// Outputs 5
//Note: just like static attributes and methods, a static inner class does not have access to members of the outer class.