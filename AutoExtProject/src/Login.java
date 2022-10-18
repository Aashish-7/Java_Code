

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {

	String userName;
	String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean login() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter UserName:\t");
		userName = s.next();
		System.out.println("Enter Password:\t");
		password = s.next();
		boolean isLoggedIn = false;

		Connection conn = DaoLayer.createConnection();
		try {
			ResultSet rs = conn.createStatement().executeQuery("Select uname,upwd from UserDetails");
			while (rs.next()) {
				if (userName.equals(rs.getString("uname")) && password.equals(rs.getString("upwd"))) {
					System.out.println("Login Successful\t");
					isLoggedIn = true;
					return isLoggedIn;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (!isLoggedIn) {
			System.out.println("User doesn't exist");
		}
		return false;

	}

}
