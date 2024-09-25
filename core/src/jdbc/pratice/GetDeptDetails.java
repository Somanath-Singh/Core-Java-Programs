package jdbc.pratice;

import java.sql.Connection;
import java.sql.DriverManager;

public class GetDeptDetails {

	public static void main(String args[]) throws Exception {
		//load tht jdbc driver
		Class.forName("jdbc.oracle.driver.OracleDriver");
		//establish the connection
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Admin");
		
	}
}
