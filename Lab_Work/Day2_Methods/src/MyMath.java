import java.text.DecimalFormat;

public class MyMath {

	public void add(int i, int j) 
	{
		System.out.println("Addition int+ int= "+ (i+j));
	}
	
	public void add(int i, double j) 
	{
		System.out.println("Addition int+double = "+ (i+j));
	}
	public void add(double i, int j) 
	{
		System.out.println("Addition double+int = "+ (i+j));
	}
	public void add(double i, double j) 
	{
		double res=i+j;
		DecimalFormat df= new DecimalFormat("#.##");
		
		System.out.println("Addition double+ double= "+ df.format(res));
	}
	
	public void sum(double... a) {
		double sum = 0;
		
		for(int i=0; i<a.length; i++)
		{
			sum+= a[i];
			
		}
		System.out.println("Sum is= " + sum);
	}
	
	
	
}
