import java.sql.*;

public class DeleteFromPrepSTMT {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","msc","msc");
			PreparedStatement pst = con.prepareStatement("delete from test where vid = ?");
			pst.setString(1, "R");
			pst.execute();
			ResultSet rs = pst.executeQuery("select * from test");
			
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
