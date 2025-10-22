
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_Insertion {
	public static void main(String[] args) throws Exception {
		Connection con = DBConn.getConn();
		Statement stmt = con.createStatement();
		Scanner sc = new Scanner(System.in);
		
		// Taking user input
		System.out.println("Enter empid:");
		String Staffid = sc.nextLine();
		
		System.out.println("Enter empname:");
		String Staffname = sc.nextLine();
		
		System.out.println("Enter dept:");
		String dept = sc.nextLine();
		
		System.out.println("Enter Salary:");
		Double Salary = sc.nextDouble();
		
		int i=stmt.executeUpdate("INSERT INTO Stafff(Staffid, Staffname, dept, Salary)"
				+ "VALUES('"+Staffid + "','"+Staffname +"','"+dept +"',"+Salary+")");
		//Output Message
		if (i==1) {
			System.out.println("Record Inserted Successfully");
		}else {
			System.out.println("Insertion Failed");
		}
		stmt.close();
		con.close();
		sc.close();
		
				
	}

}
