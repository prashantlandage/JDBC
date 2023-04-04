import java.sql.*;
import java.io.*;
import java.util.*;
public class dynamic
{
	public static void main(String args[])
	{
	
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url="jdbc:mysql://127.0.0.1:3306/prashant";
			String user="root";
			String pass="Root";

			Connection con=DriverManager.getConnection(url,user,pass);

			String q="insert into employee(id,name,dept) values(?,?,?)";

			PreparedStatement pstmt=con.prepareStatement(q);

			// Scanner sc=new Scanner(System.in);
			// System.out.println("Enter the id");
			// int a=sc.nextInt();

			// System.out.println("Enter the name :");
			// String n=sc.nextLine();

			// System.out.println("Enter the dept : ");
			// String d=sc.nextLine();

			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the id");
			int a=Integer.parseInt(br.readLine());

			System.out.println("Enter the name :");		
			String n=br.readLine();



			System.out.println("Enter the dept :");
			String d=br.readLine();


			pstmt.setInt(1,a);

			pstmt.setString(2,n);

			pstmt.setString(3,d);



			pstmt.executeUpdate();

			System.out.println("inserted...");
			con.close();


		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}