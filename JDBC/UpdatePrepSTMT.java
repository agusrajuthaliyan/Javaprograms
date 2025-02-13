import java.sql.*;

public class UpdatePrepSTMT {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","msc","msc");
			PreparedStatement pst = con.prepareStatement("update test set vnm = ? where vid = ?");

			pst.setString(1, "bat");
			pst.setString(2, "a");
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
