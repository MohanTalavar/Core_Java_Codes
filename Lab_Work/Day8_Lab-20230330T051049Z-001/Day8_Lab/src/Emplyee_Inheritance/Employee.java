package Emplyee_Inheritance;

public class Employee {
	private int empId;
	private String name;
	protected double salary;
	

	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

//
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public void calSal()
	{
		System.out.println("Employe Salary: " + salary);
		
	}
	

}
