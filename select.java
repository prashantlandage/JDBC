import java.sql.*;
public class select
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/prashant");

			String q="select * from employee";

			Statement stmt=con.createStatement();
			ResultSet set=stmt.executeQuery(q);

			while(set.next())
			{
				int id=set.getInt(1);
				String name=set.getString(2);
				String dept=set.getString(3);
			}

			System.out.println("done..");
			con.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}