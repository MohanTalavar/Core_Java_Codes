package tester;

import java.util.Map;
import java.util.Scanner;

import com.banking.BankAccount;

import custom_exceptions.BankingException;

import static utils.BankUtils.populateMap;
import static utils.BankValidations.*;
import com.banking.AcctType;

public class TestBanking {

	public static void main(String[] args) throws BankingException {
		try (Scanner sc = new Scanner(System.in)) {
			// get populated map from utils

			Map<Integer, BankAccount> acctMap = populateMap(); // Key Type: Integer | Value type: BankAccount !!!

			// Map I/f

			boolean exit = false;
			while (!exit) {
				System.out.println("Options 1. Create A/C " + "2. Display all accounts " + "3. Transfer Funds "
						+ "4.Close A/c " + "5. Fetch A/c Summary "
						+ "\n6. Display customer names having specifif type of account(admin role) A/cs " +
						"7. sorting wrt to balance:  " + "0.Exit");
				System.out.println("Choose an option");

				try {
					switch (sc.nextInt()) {

					case 1: // create an a/c
						System.out.println(
								"Enter acct details :  acctNo,  customerName,  type,  balance,  createdOn(yr-mon-day)");
						BankAccount account = validateAllInputs(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(),
								sc.next(), acctMap);
						acctMap.put(account.getAcctNo(), account);
						System.out.println("new a/c created....");
						break;

					case 2:// display acct details (admin)

						// System.out.println(acctMap); works but not iterable shows values like one set
						// . One liner

						System.out.println("Accts in the bank : ");
						for (BankAccount a : acctMap.values()) // values converting the map into the collection view
							System.out.println(a); // gets value type of references from map
						break;
					case 3: // fund transfer (customer)
						System.out.println("Enter src a/c no , dest a/c no n transfer amount");
						// get src a/c
						BankAccount src = acctMap.get(sc.nextInt());
						if (src == null)
							throw new BankingException("Invalid src acct no!!!!!!!!!!!");
						BankAccount dest = acctMap.get(sc.nextInt());
						if (dest == null)
							throw new BankingException("Invalid dest acct no!!!!!!!!!!!");
						// transfer the funds
						src.transferFunds(dest, sc.nextDouble());
						System.out.println("funds transferred.....");
						break;
						
						
					case 4: // close account
						
						System.out.println("Enter a/c no , to close the a/c");
						account = acctMap.remove(sc.nextInt());
						if (account == null)
							throw new BankingException("Invalid  acct no, Can't close A/c !!!!!!");
						System.out.println("Closed " + account);
						break;

					case 5: // customer role check account is active or not
						System.out.println("Enter your a/c no");
						account = acctMap.get(sc.nextInt());
						if (account != null)
							if (account.isActive())
								System.out.println("Account Summary " + account);
							else
								throw new BankingException("Account is dormant!!!!");
						break;

					case 6: // Display customer names having specifif type of account(admin role)

						System.out.println("Enter account type");
						AcctType type = parseAndValidateType(sc.next());
						for (BankAccount a : acctMap.values()) {
							if (type == a.getType())
								System.out.println(a.getCustomerName());
						}
						break;

						// by $ME
						
					case 7: // sort on basis of balance
						
						System.out.println("sorting wrt to balance: ");
						acctMap.values()
						.stream()
						.sorted( (s1,s2)-> ( (Double)  s1.getBalance() ).compareTo(s2.getBalance()) )
						.forEach(System.out::println);
					
						
						
						break;
						
						
//					case 8: // sort on the basis of acctno
//						
//						H
//						
//						break;
						
					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		} // sc.close

	}

}
