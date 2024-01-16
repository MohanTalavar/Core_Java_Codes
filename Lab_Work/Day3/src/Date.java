
public class Date {
	 
	private int day, month, year;
	
	public void acceptDate(int d, int m, int y)
	{
		day= d;
		month= m;
		year= y;
		
	}
	
	public void diplay()
	{
		System.out.println(day+ "/" +month+ "/" + year );
		
	}
}

