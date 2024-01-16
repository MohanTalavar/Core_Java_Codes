package utils;

import java.time.LocalDate;
import java.util.Map;

import com.app.core.Account;
import com.app.core.Bank;

import customException.BankAcoountExceptionHandling;

public class ValidationRules {

	public static final double MIN_BALANCE;
	static {
		MIN_BALANCE = 5000;
	}

	// ===========================================================

	public static Bank validateAllInputs(int acctNo, String customerName, String type, double balance, String createdOn,
			 Map<Integer, Bank> accts) throws BankAcoountExceptionHandling {

		checkForDup(acctNo, accts);
		validateBalance(balance);
		LocalDate validDate = parseCreationDate(createdOn);
		Account validType = parseAndValidateType(type);

		return new Bank(acctNo, customerName, validType, balance, validDate);
	}

	// ==============================================================

	public static void checkForDup(int acctNO, Map<Integer, Bank> accts) throws BankAcoountExceptionHandling {

		if (accts.containsKey(acctNO))
			throw new BankAcoountExceptionHandling("Duplicate found!!");
	}

	// ==============================================================

	public static void validateBalance(double balance) throws BankAcoountExceptionHandling {

		if (balance < MIN_BALANCE)
			throw new BankAcoountExceptionHandling("Balance low");
	}

	// ==============================================================

	public static Account parseAndValidateType(String type) {
		return Account.valueOf(type.toUpperCase());
	}

	// =================================================================

	public static LocalDate parseCreationDate(String date) {
		return LocalDate.parse(date);
	}

}
