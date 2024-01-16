
public class pdate {

	
			private int day,month,year;
			
			public void acceptDate(int d,int m,int y)
			{
				day = d;
				month =m;
				year = y;
				
			}
			
			
			public void displayDate()
			{
				System.out.println("Entered date is");
				System.out.println(day+"/"+month+"/"+year);
			}
}
