package Factory;
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
		String empid = sc.nextLine();
		
		System.out.println("Enter empname:");
		String empname = sc.nextLine();
		
		System.out.println("Enter dept:");
		String dept = sc.nextLine();
		
		System.out.println("Enter Salary:");
		Double Salary = sc.nextDouble();
		
		int i=stmt.executeUpdate("INSERT INTO emp1(empid, empname, dept, Salary)"
				+ "VALUES('"+empid + "','"+empname +"','"+dept +"',"+Salary+")");
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
