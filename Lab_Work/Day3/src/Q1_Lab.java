//1:Create Date class with members day,month ,year.
//Write no argument and parameterised constructor .Create two object s and initialize them using no argument and parameterised constructor
//respectively.Print date using display function.
public class Q1_Lab {

	private int day, month, year;
	
	  	Q1_Lab()
	  	{
	  		day=1;
	  		month=1;
	  		year=2000;
	  		
	  	}
	  	
	  	Q1_Lab(int d, int m, int y)
	  	{
	  		day=d;
	  		month=m;
	  		year=y;
	  		
	  	}
	  	public void acceptDate(int d, int m, int y)
	  	{
	  		day=d;
	  		month=m;
	  		year=y;
	  	}
	  	
	  	public void display()
	  	{
	  		System.out.println(day+ "/" +month+ "/" +year);
	  		
	  		
	  	}
}
