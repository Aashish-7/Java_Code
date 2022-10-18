

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoLayer {

	static Connection conn = null;
	static final String url = "jdbc:mysql://localhost:3306/autoext";
	static final String user = "root";
	static final String password = "1234567890";

	public static Connection createConnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// System.out.println("**** Loaded the JDBC driver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.err.println("Could not load JDBC driver");
			System.out.println("Exception: " + e);
			e.printStackTrace();
		} catch (SQLException ex) {
			System.err.println("SQLException information");
		}
		return conn;
	}
}
