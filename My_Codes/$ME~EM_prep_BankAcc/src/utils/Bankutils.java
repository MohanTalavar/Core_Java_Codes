package utils;

import java.util.HashMap;
import java.util.Map;

import com.app.core.Account;
import com.app.core.Bank;

import customException.BankAcoountExceptionHandling;

import static utils.ValidationRules.validateAllInputs;

public class Bankutils {
	
	public static Map<Integer,Bank> populateMap() throws BankAcoountExceptionHandling{
		
		Map<Integer,Bank> map = new HashMap<>();
		
		System.out.println("put" + 
		map.put(101, validateAllInputs(101, "Mohan", "saving", 20000, "2023-05-20", map)) );
		System.out.println("put" + 
				map.put(102, validateAllInputs(102, "Pranay", "fd", 30000, "2023-04-20", map)) );
		
		
		
		return map;
		
		
	}

}
