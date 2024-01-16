//2:Create Employee class with members id(int),name(string),dob(Date).
//Use above created Date class.
//Write default and parameterised constructor in Employee Class.Write accept() function to 
//accept information and display() to display emp information
public class Q2_Lab {
	
	private int empid;
	private String name;
//	private int dob;
	
		Q2_Lab()
		{
			empid = 0;
			name = null;
			//dob = 0;
			
		}
		
		Q2_Lab(int i, String n)
		{
			
			empid = i;
			name = n;
		}
		
		public void accept(int i,String j)
		{
			empid = i;
			name = j;
			
		}
	public void display()
	{
		System.out.println("Employee Id: "+empid);
		System.out.println("Employee Name: "+name);
	}
}
