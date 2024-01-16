package tester;

import static utils.DBUtils.openConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/*Display user details for all users , under specific role , with reg amount > specified amount
i/p : role , amount*/

public class testPSTSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Scanner sc = new Scanner(System.in);
				// open con
				Connection cn = openConnection();
				// create pst
				PreparedStatement pst = cn.prepareStatement("select * from users where role = ? and reg_amt > ?")
				){
			
			System.out.println("Enter role and reg amount:");
			// set IN params . PST API : public void setType(int paramIndex, Type val) throws se
			pst.setString(1, sc.next());
			pst.setDouble(2, sc.nextDouble());  // these 1 2 refer to the position of " ? " .
			
			// exec methods : execQuery / execUpdate / execcute
			// method of prepare statement
			// pubic RST executeQuery()throws SE
			
			try(ResultSet rst = pst.executeQuery()){
				
				// rst cursor : before the 1st row
				// rst api : public boolean next() throws se
				
				while(rst.next()) {          // here rst.getType(n) n indicates the number of col from db table//
					
					// read row data : RST API : public type getType (int colPos / String colName) throws se
					System.out.println("id, full name, regdate");
					System.out.println("id :"+ rst.getInt(1));
					System.out.println("full name: "+ rst.getString(2)+ " "+ rst.getString(3));
					System.out.println("date: "+ rst.getDate(7));
					
				}
			}// rst.close 
			
			
		} // pst, cn sc : close
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
