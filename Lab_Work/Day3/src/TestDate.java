import java.util.Scanner;

public class TestDate {

	public static void main(String[] args) {
		
		Date dob1= new Date();
		dob1.acceptDate(20, 05, 2000);
		dob1.diplay();
		
		
		Date dob2= new Date();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the date= ");
		dob2.acceptDate(sc.nextInt(), sc.nextInt(), sc.nextInt());
		dob2.diplay();
		sc.close();

	}

}
