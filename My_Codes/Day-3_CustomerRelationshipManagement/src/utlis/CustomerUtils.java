package utlis;

import java.util.ArrayList;
import java.util.List;

import com.core.app.Customer;

import Custom_Exception.CustomerHandlingException;

import static utlis.CustomerValidationRules.validateAllInputs;

public class CustomerUtils {
	
	public static List<Customer> populateCustomerlist() throws CustomerHandlingException{
		
		ArrayList<Customer> Customers = new ArrayList<>();
		
		//Mohan Talavar mohan.talawar.20@gmail.com root123 10000 2000-05-20 platinum
//		Tushar Pawar tusharp0@gmail.com root123 1000 2001-01-01 silver
//		Pranay patil pranaypatil0@gmail.com root123 2000 1998-01-01 gold
//		Abdul ahad aahadabdul0@gmail.com root123 5000 1999-01-01 diamond 
		
		Customers.add(validateAllInputs("Mohan", "Talavar", "mohan.talawar.20@gmail.com", "root123", 10000, "2000-05-20", "platinum", "2023-04-01",Customers));
		Customers.add(validateAllInputs("Tushar", "Pawar" ,"tusharp0@gmail.com" , "root123", 1000, "2001-01-01", "silver", "2023-03-01", Customers));
		Customers.add(validateAllInputs("Pranay", "Patil", "pranaypatil8055@gmail.com", "root123", 2000, "1998-01-01", "gold",  "2023-02-01",Customers));
		Customers.add(validateAllInputs("Abdul", "Aahad", "aahadabdul0@gmail.com", "root123", 5000,"1999-01-01" , "diamond" , "2023-01-01", Customers));
		
		Customers.add(
				validateAllInputs("Kiran", "Seth", "kiran@gmail.com", "3456", 2000, "1989-12-20", "gold", "2022-04-01", Customers));
		Customers.add(
				validateAllInputs("Rama", "Kher", "rama@gmail.com", "12345", 1000, "1990-11-01", "silver","2022-03-01", Customers));
//		Customers.add(validateAllInputs("Shubham", "Vaidya", "shubham@gmail.com", "2345", 2000.00, "1997-11-21", "gold",
//				Customers));
		Customers.add(validateAllInputs("Meera", "Savant", "meera@gmail.com", "2445", 5000, "1997-11-21", "2022-02-01","diamond",
				Customers));
		Customers.add(
				validateAllInputs("Mihir", "Rao", "mihir@gmail.com", "2245", 2000, "1999-11-24", "gold","2022-09-01", Customers));
		Customers.add(validateAllInputs("Kunal", "Singh", "kunal@gmail.com", "2845", 10000, "1998-01-25", "2012-04-01","platinum",
				Customers));
			
		return Customers;		
	}

}
