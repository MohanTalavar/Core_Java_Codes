package tester;

import static utlis.CustomerUtils.populateCustomerlist;
import static utlis.CustomerValidationRules.customerlogin;
import static utlis.CustomerValidationRules.validateAllInputs;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.core.app.Customer;
import com.core.app.ServicePlan;

import Custom_Exception.CustomerHandlingException;

public class testerCustomer {

	public static void main(String[] args) throws CustomerHandlingException {
		
		try(Scanner sc= new Scanner(System.in))
		{
			//initialization, create empty array list to hold customers
			List<Customer> customerList = populateCustomerlist();			
			boolean exit= false;
			System.out.println("------------Customer Realtionship Management");
			System.out.println("Packages Available: ");
			ServicePlan[] planList = ServicePlan.values();
			for(ServicePlan s: planList) {
				System.out.println(s);
			}
			System.out.println();
			
			while(!exit) {
				
				System.out.println("Actions to perform");
				System.out.println("0.Exit 1.Sign Up 2.Sign In 3.Display All 4.Change password 5.Unsubsribe 6.SortingInAscendingOrder");
				System.out.println("7.Sort customers as per dob n reg amount");
				System.out.println("Choose an option");
				
				try {
					switch (sc.nextInt()) {
					case 1: //customer registration
						
//						customer id(int) ,first name, last name (string),email(string),password(string),
//						registrationAmount(double),dob(LocalDate),plan(ServicePlan : enum)

						System.out.println("Welcome to SignUp Page");						
						System.out.println("Enter Details: FirstName LastName Email Password RegistrationAmount DateofBirth(yyyy-mm-dd) Plan");
						Customer validCustomer = validateAllInputs(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.next(), customerList);	
						customerList.add(validCustomer);
						System.out.println("Customer Signed UP! Registeration Successful..");
						
						break;
						
					case 2: // sign in
						
						System.out.println("Enter Email and Password");				
						validCustomer = customerlogin(sc.next(), sc.next(), customerList);
						System.out.println("Sign in successful: ");									
						break;
						
					case 3:// Display Customer Details
					
						System.out.println("Displaying Customer Details: ");
						Iterator<Customer> itrCustomer = customerList.iterator();
						while(itrCustomer.hasNext())
							System.out.println(itrCustomer.next());
						
						break;
						
					case 4:// change password
						
						System.out.println("Enter email oldPassword NewPassword");
						validCustomer = customerlogin(sc.next(), sc.next(), customerList);
						validCustomer.setPassword(sc.next());
						System.out.println("Password Changed!!!! ");
						break;
						
					case 5: //unsubscribe

						System.out.println("Enter email and password to unsubscribe!!!");
						validCustomer = customerlogin(sc.next(), sc.next(), customerList);
					
						int index = customerList.indexOf(validCustomer);
						validCustomer = customerList.remove(index);
						System.out.println("Unsubscription Successfull!!!!!!!" +validCustomer);
						
						break;
						
					case 6: // sorting in ascending order email
						
						Collections.sort(customerList);
						for(Customer c: customerList)
							System.out.println(c);
						break;
						
						
					case 7: // Sorting in descending order
						// Sort customers as per dob n reg amount (custom ordering n anonymous inner class)
						
						Collections.sort(customerList, new Comparator<Customer>(){
							
							@Override
							public int compare(Customer c1, Customer c2) {
								System.out.println("Compare : dob and reg amount");
								int retVal= c1.getDob().compareTo(c2.getDob());
								if(retVal==0) {
								//=> dates same --- continue to reg amount comparison
//								if(c1.getRegistrationAmount()<c2.getRegistrationAmount())
//									return -1;
//								if(c1.getRegistrationAmount()==c2.getRegistrationAmount())
//									return 0;
//								return 1;
									
									return ((Double)c1.getRegistrationAmount()).compareTo(c2.getRegistrationAmount());
								
								}
								return retVal;
							}		
						}); // ) the last parenthesis is of sort(...
						break;
						
					case 0:
						exit = true;
						break;

					default:
						System.out.println("Invalid Input!!");
						break;
					}	
					
				}catch(Exception e){
					
					e.printStackTrace();
					// read off pending token fro scannner till End of line(EOF)
					sc.nextLine();
				}// end of catch
				
				
			}// end of while
				
		}// end of try resources

	}// end of main

}
