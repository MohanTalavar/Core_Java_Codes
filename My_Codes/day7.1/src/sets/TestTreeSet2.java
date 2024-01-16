package sets;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;

public class TestTreeSet2 {

	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<>();                    // Linked List 
		
		String[] names= {"Shubham","Riya","Meera","Rama","Amish","Aniket","Rupa","Riya"};
		//populate the HS with names
		for(String s : names)
			System.out.println("Added "+list.add(s));
		
		//display set : toString , Iterator,for-each
		System.out.println("List contents "+list);
		
		//$ME~ We are ussing annonymous inner class in tress coz to sort in desc order
		// if we  want an ascending order by default treeset provides it just supply the list
		//Q : display these names in desc manner (lexicographic : desc)
		
		TreeSet<String> ts=new TreeSet<>(new Comparator<String>() {         // TreeSet annonymous inner class

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
			
		});
		ts.addAll(list);
		System.out.println("sorted in desc: "+list);
		// $ME~ as we know treesert is unordered but sorted so if we just pass the list we will 
		// 		get a sorted list and no dups as it is a set.
		//////////=====================
		
		TreeSet<String> ts1= new TreeSet<>();
		
		ts1.addAll(list);
		System.out.println( "My list :"+ts1);
		
		////////===============================
		System.out.println("Sorted set "+ts);//[]
		ts.addAll(list);
		System.out.println("Sorted set "+ts);//no dups, desc strings
		
		
			

	}

}
