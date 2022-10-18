package excptnhndlg;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FinallyBlockUse {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("d:/abc.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} finally { // use for clenup code ex.. close open resourses from try block
			if (fis != null) {
				fis.close(); // use thorws for close stmt
			}
			System.out.println("file closed.");
		}
	}

}
