package utils;

import java.util.ArrayList;
import java.util.List;

import com.app.core.Vehicle;
import static utils.VehicleValidationRules.validateAllinputs;

public class VehicleUtils {

	public static List<Vehicle> populateVehicleList(){
		
		try {
		
		ArrayList<Vehicle> v1 = new ArrayList<>();
		
		v1.add(validateAllinputs("abc-1234", "red", 345678, "2023-02-14", "Honda", v1));
		v1.add(validateAllinputs("abc-1230", "white", 445678, "2023-03-14", "Honda", v1));
		
		return v1;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
}
