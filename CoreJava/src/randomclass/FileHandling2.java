import java.io.File;
import java.io.IOException;

public class FileHandling2 {
	public static void main(String[] args) {
		try {
			File myObj = new File("D:\\coreJava\\filename1.txt");
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
				System.out.println("Absolute path: " + myObj.getAbsolutePath());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}

// To create a file in a specific directory (requires permission), specify the path of the file and use double backslashes to escape the "\" character (for Windows). 
// On Mac and Linux you can just write the path, like: /Users/name/filename.txt