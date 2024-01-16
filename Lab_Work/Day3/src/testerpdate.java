import java.util.Scanner;

public class testerpdate {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		pdate obj = new pdate();
		
		int d,m,y;
		System.out.println("Enter a date month year");
		
		obj.acceptDate(sc.nextInt(),sc.nextInt(),sc.nextInt());
		obj.displayDate();
		
		
	}
}
