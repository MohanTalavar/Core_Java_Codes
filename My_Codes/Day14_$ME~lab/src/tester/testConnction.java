package tester;

import java.sql.Connection;
import static utils.DBUtils.openConnection;

public class testConnction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Connection cn = openConnection() ){
			
			System.out.println("connected to db "+ cn);
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
