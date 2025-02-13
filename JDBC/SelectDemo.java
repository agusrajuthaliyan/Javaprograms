import java.sql.*;
public class SelectDemo {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","msc","msc");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from test");
			System.out.println("Success... Connection Made!");
			while(rs.next())
			{
				System.out.print(rs.getString(1));
				System.out.println(" "+rs.getString(2));
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
