import java.util.Scanner;

public class tester_m {

	public static void main(String[] args) {
		
		Product_M obj= new Product_M();
		System.out.println("Enter Product id : name: price ");
		Scanner sc= new Scanner(System.in);
		obj.accept(sc.nextInt(), sc.next(), sc.nextDouble());
		obj.display();
		
		System.out.println("Enter new Price value");
		
		obj.setPrice(sc.nextDouble());
		System.out.println(obj.getPrice());
		obj.display();
		
		sc.close();
	}

}
