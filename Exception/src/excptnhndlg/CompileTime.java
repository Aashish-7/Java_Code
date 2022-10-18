package excptnhndlg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CompileTime {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			@SuppressWarnings({ "unused", "resource" })
			FileInputStream fis = new FileInputStream("d:/abc.txt");
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}

// use try catch or use throws 
