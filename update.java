import java.sql.*;
import java.io.*;
public class update
{
	public static void main(String args[])
	{
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/prashant","root","Root");

			String q="update employee set name=?,dept=? where id=?";

			PreparedStatement pstmt=con.prepareStatement(q);

			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the new name");
			String n=br.readLine();

			System.out.println("Enter the new city");
			String c=br.readLine();

			System.out.println("Enter the id");
			int i=Integer.parseInt(br.readLine());

			pstmt.setString(1,n);
			pstmt.setString(2,c);
			pstmt.setInt(3,i);

			pstmt.executeUpdate();

			System.out.println("updated..");
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}