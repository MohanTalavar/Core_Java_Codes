package tester;

import static utils.DBUtils.openConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/*Display user details for all users , under specific role , with reg amount > specified amount
i/p : role , amount*/

public class testPSTSelect2_unsub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Scanner sc = new Scanner(System.in);
				// open con
				Connection cn = openConnection();
				// create pst
				PreparedStatement pst = cn.prepareStatement("delete from users where id=?")
				){
			
			System.out.println("Enter user id:");
			// set IN params . PST API : public void setType(int paramIndex, Type val) throws se
			pst.setInt(1, sc.nextInt());
			
			
			// exec methods : execQuery / execUpdate / execcute
			// method of prepare statement
			// pubic RST executeQuery()throws SE

			int retVal = pst.executeUpdate();
			if(retVal==1)
				System.out.println("User Unsubscribed!!!");
			else
				System.out.println("user id not found ! unsub failed");
				
				
				
			
			
	
		} // pst, cn sc : close
		catch(Exception e) {
			e.printStackTrace();
		}

	}
}


