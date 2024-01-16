package sets;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {              // LinkedHashSet Ordered and Unsorted!!!
		//LinkedHashSet() : size 0
		
		LinkedHashSet<String> hs=new LinkedHashSet<>();  // declaring Linkedhashset hs
		
		String[] names= {"Shubham","Riya","Meera","Rama","Amish","Aniket","Rupa","Riya"};
		//populate the HS with names
		for(String s : names)
			System.out.println("Added "+hs.add(s));
		//display set : toString , Iterator,for-each
		System.out.println("HS contents "+hs);
		
			

	}

}
