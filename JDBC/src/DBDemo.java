import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DBDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Found");
		
		Connection con=
				DriverManager.getConnection("jdbc:mysql://localhost:3306/tns","root","rootpassword");
		System.out.println("Established Connection"); 
		
//		
		PreparedStatement pstmt=con.prepareStatement("insert into employee values(?,?,?)");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Employee ID=");
		int id=s.nextInt();
		System.out.println("ENter employeee name=");
		String name=s.next();
		System.out.println("Enter employee salary");
		float sal=s.nextFloat();
		
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setFloat(3, sal);
		
		
		int i=pstmt.executeUpdate();
		if(i>0)
			System.out.println("Employee record Successfully Inserted!!");
		else
			System.out.println("FAiled!!");
		
		
//		PreparedStatement pstmt=con.prepareStatement("Select * from Employee");
//		ResultSet rs=pstmt.executeQuery();
//		while(rs.next())
//			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
		
	}

}
