//5. Create a class Point with data members as x,y.  Write 
//getters and setters for all the data members. Also add the display function. 
//Create the object of this class in main method and invoke all the methods in that class. 

package Logic;

public class Point_Q5 {

		private int x, y;

		public Point_Q5() {
			System.out.println("Default Constructor:");
			x= 5;
			y= 5;	
		}

		public Point_Q5(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}
		
		public void Display()
		{
			System.out.println("Value of x: " +x+ " Value of y:" +y);
			
		}
		
	
}
