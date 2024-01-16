package utils;

import java.time.LocalDate;
import java.util.List;

import com.app.core.Color;
import com.app.core.Vehicle;

import CustomException.VehicleHandlingException;

public class VehicleValidationRules {
	
	
	public static Vehicle validateAllinputs(String chasisNo, String vehicleColor, double netPrice, 
			String manufactureDate, String company, List<Vehicle> vehicles)
	throws VehicleHandlingException{
		
		checkForDuplicate(chasisNo, vehicles);
		Color validColor= parseAndValidateColor(vehicleColor);
		LocalDate validDate = parseAndValidateDate(manufactureDate);
		
		
		return new Vehicle(chasisNo, validColor, netPrice, validDate, company);
	}
	
	//=====================================================================

	public static LocalDate parseAndValidateDate(String Date) throws VehicleHandlingException {

		LocalDate d1 = LocalDate.parse(Date);

		LocalDate beginYear = LocalDate.of(LocalDate.now().getYear(), 1, 1);
		if (d1.isAfter(beginYear))
			return d1;
		throw new VehicleHandlingException("Vehicle mfg must me after 1st jan of current year!!");
	}

	//=============================================================
		
	public static Color parseAndValidateColor(String clr){
		
		return Color.valueOf(clr.toUpperCase());
	}
	
	//===========================================================
	
	public static void checkForDuplicate(String newChasisNo, List<Vehicle> vehicleList)
	throws VehicleHandlingException{
		
		Vehicle newVehicle = new Vehicle(newChasisNo);
		if(vehicleList.contains(newVehicle))
			throw new VehicleHandlingException("Dup Found");
		System.out.println("No dub found!!!");
		
	}
	
		
		
		
	

}
