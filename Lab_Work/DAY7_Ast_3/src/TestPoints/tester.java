package TestPoints;

import java.util.Scanner;

import com.cdac.geometry.Point2D;

public class tester {

	public static void main(String[] args) {
		
		Point2D[] point= new Point2D[2];
		
		Scanner sc= new Scanner(System.in);
		
		// accepting co-ordinates
		for(int i=0; i<point.length;i++ )
		{
		System.out.println("Enter x & y co-ordinates for"+ " Point: " +(i+1) );
		point[i]= new Point2D(sc.nextDouble(), sc.nextDouble());
		
		}

		// displaying co-ordinates with show()
		for(int i=0; i<point.length; i++)
		{
			System.out.println("Point:" +(i+1));
			System.out.println(point[i].show());			
		}
		
		System.out.println("\n");
		boolean equal;
		
		equal= point[0].isEqual(point[1]);
		
		if(equal==true)
			System.out.println("Point 1 & 2 are equal");
		else
			System.out.println("Points 1 & 2 are not equal !!!");
		
		// calculating distance
		System.out.println("\n");
		point[0].calDist(point[1]);
		
		System.out.println("--------------------");
		
		System.out.println("Enter the no of points to store");
		int n= sc.nextInt();
		
		Point2D[] point1= new Point2D[n];
		int index= 0;
		
		for(int i=0; i<point1.length;i++ )
		{
		System.out.println("Enter x & y co-ordinates for"+ " Point: " +(i+1) );
		point1[i]= new Point2D(sc.nextDouble(), sc.nextDouble());
		index++;
		
		}
		
		// displaying using traditional for loop
//		for(int i=0; i<index; i++)
//		{
//			
//			System.out.println(point1[i].show());
//		}
		
		// displaying using for each loop
		System.out.println("Points stored are as follows: ");
		for( Point2D s : point1)
		{
			String str= s.show();
			System.out.println(str);
		}
		
		
		
		sc.close();
	}

}







