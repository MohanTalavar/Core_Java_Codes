package Emplyee_Inheritance;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee obj= new Manager(101 , "manager" , 20, 10); //Upcasting
		System.out.println(obj);
		
		((Manager)obj).perBonus();

	}

}
