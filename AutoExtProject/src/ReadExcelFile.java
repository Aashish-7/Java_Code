import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.mysql.cj.result.Row;

//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	public static void readExcel(String filePath, String fileName, String sheetName) throws IOException {
		File file = new File(filePath + "\\" + fileName);
		FileInputStream inputStream = new FileInputStream(file);
		Workbook workBook = null;
		String fileExtensionName = fileName.substring(fileName.indexOf("."));
		if (fileExtensionName.equals(".xlsx")) {
			workBook = new XSSFWorkbook(inputStream);
		} else if (fileExtensionName.equals(".xls")) {
			workBook = new HSSFWorkbook(inputStream);
		}
		Sheet guru99Sheet = workBook.getSheet(sheetName);

		String urlPrefix = "jdbc:db2:";
		String url;
		String user;
		String password;
		String empNo;
		Connection con;
		Statement stmt;
		ResultSet rs;
		// url =
		// "jdbc:db2://dashdb-txn-sbox-yp-lon02-04.services.eu-gb.bluemix.net:50000/BLUDB";
		url = "jdbc:mysql://localhost:3306/autoext";
		user = "root";
		password = "1234567890";

		int rowCount = guru99Sheet.getLastRowNum() - guru99Sheet.getFirstRowNum();
		for (int i = 1; i < rowCount + 1; i++) {
			Row row = guru99Sheet.getRow(i);
			String[] arr = new String[row.getLastCellNum()];
			for (int j = 0; j < row.getLastCellNum(); j++) {
				String str = "" + row.getCell(j);

				Cell cell1 = row.getCell(0);
				// x = cell1.getStringCellValue();
				// dateList.add(x);

				Cell cell2 = row.getCell(1);
				// y = (int)cell2.getNumericCellValue();
				// newCasesList.add(y);

				System.out.print(row.getCell(j) + "|| ");
				arr[j] = str;
				}

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("**** Loaded the JDBC driver");
				con = DriverManager.getConnection(url, user, password);
				con.setAutoCommit(false);
				// String id, name, gender, gmail, contact, address;
				String labLocation, address;
				int sno;
				double sno1;
				sno1 = Double.parseDouble(arr[0].trim().toString());
				sno = (int) sno1;
				labLocation = arr[1];
				address = arr[2];
				// contact = arr[4];
				// gmail = arr[3];
				// address = arr[5];
				PreparedStatement stmt1 = con
						.prepareStatement("INSERT INTO labinfo (SNO,LABLOCATION,ADDRESS) values(?,?,?)");
				stmt1.setInt(1, sno);
				stmt1.setString(2, labLocation);
				stmt1.setString(3, address);

				int a = stmt1.executeUpdate();
				if (a == 1)
					System.out.println("done");
				stmt = con.createStatement();

				rs = stmt.executeQuery("SELECT * FROM LABINFO");
				System.out.println("**** Created JDBC ResultSet object");
				rs.close();
				stmt.close();
				con.commit();
				con.close();
				System.out.println("**** JDBC Exit from class EzJava - no errors");

			} catch (ClassNotFoundException e) {
				System.err.println("Could not load JDBC driver");
				System.out.println("Exception: " + e);
				e.printStackTrace();
			} catch (SQLException ex) {
				System.err.println("SQLException information");
				while (ex != null) {
					System.err.println("Error msg: " + ex.getMessage());
					System.err.println("SQLSTATE: " + ex.getSQLState());
					System.err.println("Error code: " + ex.getErrorCode());
					ex.printStackTrace();
					ex = ex.getNextException(); // For drivers that support chained exceptions
				}
			}
			// System.out.println("\nDate :\t"+dateList.get(i)+"\t New Cases:\t"
			// +newCasesList.get(i));
			System.out.println();
		}

	}

	static String s = "";

	ReadExcelFile(String fname) throws IOException {
		s = fname;
		String filePath = "/home/downloads/AutomaticExt";
		FileInputStream fileInputStream = new FileInputStream(filePath + "/home/downloads/AutomaticExt" + s);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		for (int i = 0; i < workbook.getNumberOfSheets(); i++) {

			System.out.println("Sheet name: " + workbook.getSheetName(i));
		}
		System.out.println("Sheet name: " + workbook.getSheetName(0));
		readExcel(filePath, s, workbook.getSheetName(0));
	}

}
