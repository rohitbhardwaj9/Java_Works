package utility_class;

import java.sql.Connection;

public class checkConnection {

	public static void main(String[] args) {
		
//		Connection con = ConnectionProvider.getConnection();
//		System.out.println(con); //working

		Connection con = DBHandler.establishConnection();
		System.out.println(con); // Not Working
	}

}
