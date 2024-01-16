package utils;

import java.time.LocalDate;

import com.app.core.Color;
import com.app.core.Vehicle;

import customExp.VehicleHandlingExp;
import custom_exceptions.VehicleHandlingException;

// by me 

public class VehicleValidationRules {

	
	public static LocalDate parseAndValidDate(String Date) throws VehicleHandlingExp{
		
		LocalDate d1 = LocalDate.parse(Date);
		
		LocalDate beginYear = LocalDate.of(LocalDate.now().getYear(), 1, 1);
		
		if(d1.isAfter(beginYear))
			return d1;
		throw new VehicleHandlingExp("Vehicle manufacture date must be after 1st Jan of current year!" );
		
	}// end of parse and validation of date
	
	//=====================================================================================================================
	
   
	public static Color parseAndValidateColor(String clr) {
		
		return Color.valueOf(clr.toUpperCase()); // here if user enters wrong color, it will create an illegalargexp which is unchecked exp
	}
		
	//===================================================================================================================================
	
	public static void cheackForDuplicate(String newChasisNo, Vehicle[] vehicles) throws VehicleHandlingExp{
		
		Vehicle newVehicle = new Vehicle(newChasisNo);
		for(Vehicle v: vehicles)
			if(v!=null)
				if(v.equals(newVehicle))
					throw new VehicleHandlingExp("Duplicate Chasis No!!!!!!!!!!!!");
		System.out.println("NO dup found!!!");
		
		
	}
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
