package practice;
import java.sql.*; //1
import java.util.Scanner;
public class JDBCPractice {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        Class.forName("oracle.jdbc.driver.OracleDriver");  //2
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
                                                "ganesh",
                                            "password"); //3
        String query = "delete from emp where empno = ?"; //5
        PreparedStatement s = conn.prepareStatement(query);
        System.out.println("enter the emp i to remove: ");
        s.setInt(1,sc.nextInt());
        s.executeUpdate();
    }
}
