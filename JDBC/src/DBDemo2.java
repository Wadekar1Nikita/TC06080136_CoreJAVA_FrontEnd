import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBDemo2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Found");
		
		Connection con=
				DriverManager.getConnection("jdbc:mysql://localhost:3306/tns","root","rootpassword");
		System.out.println("Established COnnection"); 

//		PreparedStatement pstmt=con.prepareStatement("insert into employee values(?,?,?)");
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter Employee ID=");
//		int id=s.nextInt();
//		System.out.println("ENter employeee name=");
//		String name=s.next();
//		System.out.println("Enter employee salary");
//		float sal=s.nextFloat();
//		
//		pstmt.setInt(1, id);
//		pstmt.setString(2, name);
//		pstmt.setFloat(3, sal);
		String sql="UPDATE employee SET id =?, name=?, sal=? WHERE id=?";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setInt(1, 101);
		pstmt.setString(2, "Nikita");
		pstmt.setFloat(3, 9870.0f);
		
		int rowsUpdate=pstmt.executeUpdate();
		if(rowsUpdate>0)
		{
			System.out.println("updates successfully");
		}
	
		
	}
}
