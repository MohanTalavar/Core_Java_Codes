package utils;
import java.sql.*;

public class DBUtils {
	
	private static Connection cn;
	// add a static method to open data base connection 
	public static Connection openConnection() throws SQLException {
		
		//DriverMnager : class : getConnection(url,nm,pass) throws sqlexc
		String url= "jdbc:mysql://localhost:3306/advancejava?createDatabaseIfNotExist=true&useSSL=false&allowPublicKeyRetrieval=true";
		cn=DriverManager.getConnection(url, "root","root123");
		return cn;
		
	}

}
