import java.sql.*;
public class ResultSetMetaDataDemo {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","msc","msc");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from test");
			System.out.println("Success... Connection Made!");
			
			ResultSetMetaData rd = rs.getMetaData();
			
//			Method 1: Manual
//			System.out.println(rd.getColumnCount());
//			System.out.println(rd.getColumnName(1));
//			System.out.println(rd.getColumnName(2));
//			System.out.println(rd.getColumnType(1));
//			System.out.println(rd.getColumnType(2));
			
			for(int i=1;i<=rd.getColumnCount();i++)
			{
				System.out.println(rd.getColumnType(i)+" ");
			}
			System.out.println();
			System.out.println("-----------");
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
