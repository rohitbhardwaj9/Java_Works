import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDOperation {

	Connection con = ConnectionProvider.getConnection();

	public void insertEmployee() {
		try {
			Statement stmt = con.createStatement();
			String query = "insert into Employee(id,name,address,designation) values(1,'viswanath','hyd','PE')";
			
			int i = stmt.executeUpdate(query);
			if(i>0) {
				System.out.println("Employee data successfully inserted");
			}
		} catch (Exception e) {
			System.out.println("Exception thrown: "+ e);
		}
		
	}
	
	public void selectEmployee() {
		try {
			Statement stmt = con.createStatement();
			String query = "Select * from employee where id=1";
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println("ID: "+rs.getInt(1)+", Name: "+rs.getString(2)+", Address: "+rs.getString(3)+", Designation: "+rs.getString(4));
			}
		} catch (Exception e) {
			System.out.println("Exception thrown: "+e);
		}
	}
	
	public void updateEmployee() {
		try {
			Statement stmt = con.createStatement();
			String query = "update employee set name='Vishwa' where id=1";
			int i = stmt.executeUpdate(query);
			if(i>0) {
				System.out.println("Employee is updated successfully");
			}
			
		} catch (Exception e) {
			System.out.println("Exception thrown: "+e);
		}
	}
	
	public void deleteEmployee() {
		try {
			Statement stmt = con.createStatement();
			String query = "delete from employee where id=1";
			int i = stmt.executeUpdate(query);
			if(i>0) {
				System.out.println("Successfully Deleted!!!");
			}else {
				System.out.println("Something went wrong...");
			}
		} catch (Exception e) {
			System.out.println("Exception thrown: "+e);
		}
	}

}
