package Emplyee_Inheritance;

public class Manager extends Employee{

	private double perBonus;

	public Manager(int empId, String name, double salary, double perBonus) {
		super(empId, name, salary);
		this.perBonus = perBonus;
	}
	
	public void calSal()
	{
		System.out.println("Employe Salary: " + (super.salary+ perBonus)  );
		
	}
	
	public String toString() {
		return super.toString()+ "Performance B:" + perBonus;
	}
	
	public void perBonus()
	{
		
		System.out.println("PerfBonus: " + perBonus);
	}
	
}
