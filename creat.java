
import java.sql.*;
public class creat{
	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url="jdbc:mysql://127.0.0.1:3306/prashant";
			String user="root";
			String pass="Root";

			Connection con= DriverManager.getConnection(url,user,pass);

			String q="create table student(roll int(20),name varchar(50),city varchar(50))";

			Statement stmt= con.createStatement();

			stmt.executeUpdate(q);

			System.out.println("table created..");

			con.close();



		}catch(Exception e)
		{
			e.printStackTrace();
		}
		


	}
}