import java.util.Scanner;

public class PackagesJava {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
	Scanner myObj = new Scanner(System.in);
    System.out.println("Enter username");

    String userName = myObj.nextLine();
    System.out.println("Username is: " + userName);
  }
}