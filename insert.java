import java.sql.*;
public class insert{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url="jdbc:mysql://127.0.0.1:3306/prashant";
			String user="root";
			String pass="Root";

			Connection con=DriverManager.getConnection(url,user,pass);

			// create query

			String q="insert into student(roll,name,city) values(?,?,?)";

			//prepare statement
			PreparedStatement pstmt= con.prepareStatement(q);

			//set the values in table
			pstmt.setInt(1,1);
			pstmt.setString(2,"adesh");
			pstmt.setString(3,"solapur");

			pstmt.executeUpdate();

			System.out.println("inserted...");
			con.close();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}