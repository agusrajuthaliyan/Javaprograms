import java.sql.*;

public class createDemo {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","msc","msc");
			Statement stmt = con.createStatement();

			String vid = "a";
			String vnm = "car";
			stmt.executeUpdate("insert into test values('"+vid+"','"+vnm+"')");
			vid ="b";
			vnm = "tar";
			stmt.executeUpdate("insert into test values('"+vid+"','"+vnm+"')");
			ResultSet rs = stmt.executeQuery("select * from test");
			

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
