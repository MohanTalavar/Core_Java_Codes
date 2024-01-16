package test;

import entities.Employee;
import static utils.ValidationRules.ValidateEmployee;

public class testerEmployee {

	public static void main(String[] args) {
	
		try {
			
			Employee emp1= ValidateEmployee("Mohan", "Talavar", "2022-01-01", 20);
			System.out.println(emp1);
			
			Employee emp2 = ValidateEmployee("Pranay", "patil", "2022-01-01", 10);
			System.out.println(emp2);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
