package jdbcconnectionpractice;
import java.sql.*;
import java.util.*;
public class MainClass {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "ganesh";
		String pass = "password";
		Connection con = DriverManager.getConnection(url, user, pass);
		String query = "SELECT * FROM EMP";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {
		    System.out.println(
		        rs.getInt("EMPNO") + " " +
		        rs.getString("ENAME") + " " +
		        rs.getString("JOB") + " " +
		        rs.getInt("MGR") + " " +
		        rs.getDate("HIREDATE") + " " +
		        rs.getDouble("SAL") + " " +
		        rs.getDouble("COMM") + " " +
		        rs.getInt("DEPTNO")
		    );
		}
	}
}
