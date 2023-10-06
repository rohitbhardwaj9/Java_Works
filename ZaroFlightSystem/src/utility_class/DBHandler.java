package utility_class;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBHandler {

	static Connection con;
	
	public static Connection establishConnection() {
		
		try {
			FileReader reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("db.classname"));
			
			return DriverManager.getConnection(
					prop.getProperty("db.url"), 
					prop.getProperty("db.username"),
					prop.getProperty("db.password"));
		} catch (Exception e) {
			System.out.println("Exception thrown: "+ e);
		}
		
		return con;
	}
}
