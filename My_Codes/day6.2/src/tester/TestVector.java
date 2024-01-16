package tester;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		
		Vector<String> strings=new Vector<>(5, 12);      // Decalring VectorList !!
		
		for(int i=0;i<10;i++)
			strings.add("name "+i);
		
		System.out.println(strings);
		System.out.println(strings.size());
		System.out.println(strings.capacity());
		//sort these strings n display the same
		System.out.println("+=====================");
		
		Vector<String> strings2=new Vector<>();       // Declaring Vector list strings2
		
		String[] names= {"Rutuj","Anish","Priyanka","Amiti","Shubham","Ravi"};
		for(String s : names)
			strings2.add(s);
		System.out.println(strings2);
		
		Collections.sort(strings2);
		
		System.out.println("sorted strings");
		System.out.println(strings2);
		//desc sorted manner
		Collections.sort(
				strings2, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o2.compareTo(o1);
				}
			
			}
		);
		System.out.println("sorted strings : desc"); 
		System.out.println(strings2);
		
		System.out.println("==================ME=====");
		
		//By $ME~
		
		Vector<String> nameList = new Vector<>();            // Declaring vector list
		
		String[] s1 = {"Mohan", "Pranay","Tushar","Aahad"};
		
		for(String s: s1)
			nameList.add(s);
		System.out.println(nameList);
		Collections.sort(nameList);
		System.out.println("Sorted in asc: "+nameList);
		
		//==========================================
		
		Collections.sort(
				
				nameList, new Comparator<String>()
				{
					@Override
					public int compare(String s1 , String s2) {
						return s2.compareTo(s1);
					}
				}
				
			);
		System.out.println("Sorted in desc: "+ nameList);
		
		//=============================================
		System.out.println("----------------------------------------");
		
		Vector<Integer> list1 = new Vector<>();
		
		int[] data = {111,222,333,444,555,666,777,10,20,30,1000};
		
		for(int i: data)
			list1.add(i);
			
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println("Sorted in asc: "+ list1);
		
		
		Collections.sort(
				
				list1, new Comparator<Integer>() {
					
					public int compare(Integer i1, Integer i2) {
						return i2.compareTo(i1);
					}
					
				}
				
				);
		System.out.println("Sorted in desc: "+ list1);
		
		
		
		
		
		
		
		
		
		

	}

}
