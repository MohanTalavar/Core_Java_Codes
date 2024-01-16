package tester;

import static utils.VehicleUtils.populateVehicleList;
import static utils.VehicleValidationRules.validateAllinputs;
import static utils.VehicleValidationRules.parseAndValidateColor;

import java.time.LocalDate;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.app.core.Color;
import com.app.core.Vehicle;

import CustomException.VehicleHandlingException;

public class testVehicle {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			List<Vehicle> showroom = populateVehicleList();
			System.out.println(showroom);
			boolean exit = false;

			while (!exit) {

				System.out.println("Options 1. Add a Vehicle 2. Display all "
						+ "3. Get specific vehicle details \n4. Apply discount  "
						+ "5. Delete vehicle details  by ch no 6. Delete vehicles by color " + "0.Exit");
				System.out.println("Choose an option");

				try {
					switch (sc.nextInt()) {
					case 1: // add a new vehicle

						System.out.println(
								"Enter vehicle details: " + "String chasisNo, Color vehicleColor, double basePrice,"
										+ " LocalDate manufactureDate (yyyy-mm-dd), String company");
						showroom.add(validateAllinputs(sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.next(),
								showroom));
						System.out.println("Vehicle added!!!");

						break;

					// case1: checked!!!!!

					case 2:// Display all vehicle details
						System.out.println("List of all vehicles");
						ListIterator<Vehicle> litr = showroom.listIterator();
						while (litr.hasNext())
							System.out.println(litr.next());

						break;

					// case2: checked !!!!!

					case 3: // get specific vehicle details;
						System.out.println("Enter vehicles chasis number: ");
						Vehicle check = new Vehicle(sc.next());
						int index = showroom.indexOf(check);
						if (index == -1)
							throw new VehicleHandlingException("Invalid ch no!!");
						System.out.println(showroom.get(index));
						break;

					case 4: // Discount
						System.out.println("Enter date and discount amount");
						LocalDate date = LocalDate.parse(sc.next());
						double discount = sc.nextDouble();
						for (Vehicle v : showroom)
							if (v.getManufactureDate().isBefore(date))
								v.setNetPrice(v.getNetPrice() - discount);
						System.out.println("discount applied");

						break;

					case 5: // delet vehicles by ch no

						System.out.println("Enter ch no");
						check = new Vehicle(sc.next());
						index = showroom.indexOf(check);
						if (index == -1)
							throw new VehicleHandlingException("invalid ch no");
						System.out.println("removed vehicle" + showroom.remove(index));
						break;

					case 6: // delete vehicle wrt color
						System.out.println("Enter vehicle color: ");
						Color chkclr = parseAndValidateColor(sc.next());

						ListIterator<Vehicle> litr1 = showroom.listIterator();
						while (litr1.hasNext())
							if (litr1.next().getVehicleColor() == chkclr)
								litr1.remove();

						System.out.println("vehicle removed of color: " + chkclr);

						break;

					case 0:
						exit = true;
						System.out.println("Exited!!!");
						break;

					default:
						System.out.println("Invalid Input");
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}

			} // end of while

		} // try with res

	}// end of main

}
