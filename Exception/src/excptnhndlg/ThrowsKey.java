package excptnhndlg;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

class ReadAndWrite {
	@SuppressWarnings("unused")
	void readFile() throws FileNotFoundException {
		@SuppressWarnings("resource")
		FileInputStream fis = new FileInputStream("d:/abc.txt");
	}

	void saveFile() throws FileNotFoundException {
		@SuppressWarnings("unused")
		String txt = "This is demo";
		@SuppressWarnings({ "unused", "resource" })
		FileOutputStream fos = new FileOutputStream("Home/Downloads/Project/xyz.txt");
	}
}

public class ThrowsKey {

	public static void main(String[] args) {
		ReadAndWrite rw = new ReadAndWrite();
		try {
			rw.readFile();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("check aytomatically termination or not ");
		try {
			rw.saveFile();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
