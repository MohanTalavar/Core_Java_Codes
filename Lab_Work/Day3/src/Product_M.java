
public class Product_M {
	
		private int prdid;
		private String name;
		private double price;
		
		public void accept(int id, String nm, double pr)
		{
			prdid= id;
			name= nm;
			price= pr;
			
		}
		
		public void display()
		{
			System.out.println("Product Id= "+ prdid);
			System.out.println("Product Name "+ name);
			System.out.println("Product price= "+ price);
			
		}
		
		public void setPrice(double npr)
		{
			price= npr;
		}
		
		public double getPrice()
		{
			System.out.println("Updated Price= ");
			return price;
		}
		
		
		
		
		
		
		
}
