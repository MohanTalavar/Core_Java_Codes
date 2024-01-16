import java.util.Scanner;

//1:Create Date class with members day,month ,year.
//Write no argument and parameterised constructor .Create two object s and initialize them using no argument and parameterised constructor
//respectively.Print date using display function.
public class Q1_TestLab {

	public static void main(String[] args) {
		Q1_Lab obj= new Q1_Lab();
		System.out.println("No Arguments-----");
		obj.display();
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter day: month: year= ");
		Q1_Lab obj1= new Q1_Lab(sc.nextInt(), sc.nextInt(), sc.nextInt());
		System.out.println("Parameterized------");
		obj1.display();
		
		sc.close();

	}

}
