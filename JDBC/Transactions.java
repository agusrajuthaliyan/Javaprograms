import java.sql.*;
public class Transactions {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","msc","msc");
			Statement stmt = con.createStatement();
			
			con.setAutoCommit(false);
			stmt.executeUpdate("insert into test values ('y','war')");
			System.out.println("Row Inserted!!!");
			
//			con.commit();
			con.rollback();
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
}
