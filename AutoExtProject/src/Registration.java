

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Registration {

	String userName;
	String userPassword;
	String emailId;
	String mobileNumber;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public void entry() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter UserName:");
		userName = s.next();
		System.out.println("Enter Password:");
		userPassword = s.next();
		System.out.println("Enter Email:");
		emailId = s.next();
		System.out.println("Enter Mobile Number:");
		mobileNumber = s.next();

		save(userName, userPassword, emailId, mobileNumber);

	}

	public void save(String uname, String upwd, String email, String mNo) {
		Connection conn = DaoLayer.createConnection();
		try {
			PreparedStatement stmt1 = conn
					.prepareStatement("INSERT INTO UserDetails (uname,upwd,email,mno) values(?,?,?,?)");
			stmt1.setString(1, uname);
			stmt1.setString(2, upwd);
			stmt1.setString(3, email);
			stmt1.setString(4, mNo);

			int a = stmt1.executeUpdate();
			if (a == 1)
				System.out.println("done");
			// conn.commit();
			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Override
	public String toString() {
		return "Registration [userName=" + userName + ", userPassword=" + userPassword + ", emailId=" + emailId
				+ ", mobileNumber=" + mobileNumber + "]";
	}

}