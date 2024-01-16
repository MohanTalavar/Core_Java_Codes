package utlis;

import static java.time.LocalDate.parse;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import com.core.app.Customer;
import com.core.app.ServicePlan;

import Custom_Exception.CustomerHandlingException;

public class CustomerValidationRules {

	// no dup acc : public static void checkForDup(string , array list){ api:
	// contains . throw exp if fup found}
	// validate plan
	// reg amount must match with the plan
	// customer age must be > 21: lab work

	// add a static method customers login
	
	public static Customer customerlogin(String email, String password, List<Customer> CustomerList) throws CustomerHandlingException
	{
		
		int index = CustomerList.indexOf(new Customer(email));
		if(index== -1)
			throw new CustomerHandlingException("Invalid Email");
		Customer validCustomer = CustomerList.get(index);
		if(validCustomer.getPassword().equals(password))
			System.out.println("successful login");
		else
			throw new CustomerHandlingException("Invalid password!!!!");
		return validCustomer;
					
	}
	
	
	
	////////==========================================================================
	
	public static Customer validateAllInputs(String firstName, String lastName, String email, String password,
			double registrationAmount, String dob, String plan,String regdate, List<Customer> CustomerList)
			throws CustomerHandlingException {

		checkForDup(email, CustomerList);
		ServicePlan servicePlan = parseValidatePlanAndRegAmount(plan.toUpperCase(), registrationAmount);
		LocalDate dateOfBirth = validateCustomerAge(dob);
	    int age = Period.between(LocalDate.now(), dateOfBirth).getYears();
		return new Customer(firstName, lastName, email, password, registrationAmount, dateOfBirth, servicePlan, LocalDate.now());
	}

	// ===================================================================================================

	public static void checkForDup(String newEmail, List<Customer> CustomerList) throws CustomerHandlingException {

		Customer newCust = new Customer(newEmail);
		if (CustomerList.contains(newCust))
			throw new CustomerHandlingException("Dup found!!");
		System.out.println("no dup found");
	}

	// =================================================================================================

	// Discarded by mam dont use for each loop directly use values of to compare///

//	public static ServicePlan validatePlan( String planName, double price) throws CustomerHandlingException {
//		
//		
//			
//			for(ServicePlan plan : ServicePlan.values()) {
//				
//				if(planName.equals(plan.name()))
//				if(price==plan.getPlanCharges())
//					return plan;
//					
//			}// for
//			 throw new CustomerHandlingException("Plan invalid");
//			
//	}
	// =======================================================================================

	// customer age must be > 21: lab work

	public static LocalDate validateCustomerAge(String dob) throws CustomerHandlingException {
		LocalDate dateOfBirth = parse(dob);
		//=> parsing is successful
		int age = Period.between(dateOfBirth, LocalDate.now()).getYears();
		if (age < 21) 
			throw new CustomerHandlingException("Below Age than 21");
		return dateOfBirth;

	}

	/////////////////////////////// ================================= By mam on day6

//	public static ServicePlan parseAndValidatePlan(String planName) throws IllegalArgumentException{
//		
//		return ServicePlan.valueOf(planName.toUpperCase()); // if invalid i/p : IllegalArgumentException
//	}
//	
//	//=============================================================================
//	
//	// add a static method to validate reg amount matching with the plan
//	
//	public static void validateRegAmount(String planName, double regAmount) throws CustomerHandlingException {
//		
//		if(ServicePlan.valueOf(planName.toUpperCase()).getPlanCharges()==regAmount)
//			System.out.println("Reg amount Validated");
//		throw new CustomerHandlingException("Registration amount Invalid!!!!!!");
//	}

	// combining two methods in one for optimization:

	public static ServicePlan parseValidatePlanAndRegAmount(String planName, double regAmount)
			throws IllegalArgumentException, CustomerHandlingException {

		ServicePlan plan = ServicePlan.valueOf(planName.toUpperCase());
		if (plan.getPlanCharges() != regAmount)
			throw new CustomerHandlingException("Invalid Plan or registration amount!!!!");
		return plan;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
