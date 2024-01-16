import java.util.Scanner;

//2:Create Employee class with members id(int),name(string),dob(Date).Use above 
//created Date class.
//Write default and parameterised constructor in Employee Class.Write accept()
//function to accept information and display() to display emp information
//public class Q2_TestLab {
public class Q2_TestLab {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Q2_Lab obj = new Q2_Lab();
		Q1_Lab obj1 = new Q1_Lab();
		System.out.println("Default Parameterized------");
		obj.display();
		System.out.println("Date = ");
		obj1.display();

		System.out.println("------------------");
		System.out.println("Enter Employee Id   Name  ");
		Q2_Lab obj11 = new Q2_Lab(sc.nextInt(), sc.next());
		obj11.display();
		System.out.println("--------Date-------");
		Q1_Lab obj2= new Q1_Lab(sc.nextInt(), sc.nextInt(), sc.nextInt());
		System.out.println("--------Entered Date-------");
		obj2.display();

//		Q2_Lab obj3 = new Q2_Lab();
		
		Q1_Lab obj3= new Q1_Lab(sc.nextInt(), sc.nextInt(), sc.nextInt());
//		System.out.println("Enter Id & Name");
//		obj3.accept(25, "pranay");
//		obj3.display();

		sc.close();

	}

}
