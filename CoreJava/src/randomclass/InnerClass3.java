// Access Outer Class From Inner Class
// One advantage of inner classes, is that they can access attributes and methods of the outer class:
class OuterClass3 {
  int x = 10;

  class InnerClass {
    public int myInnerMethod() {
      return x;
    }
  }
}

public class InnerClass3 {
  public static void main(String[] args) {
    OuterClass3 myOuter = new OuterClass3();
    OuterClass3.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.myInnerMethod());
  }
}

// Outputs 10