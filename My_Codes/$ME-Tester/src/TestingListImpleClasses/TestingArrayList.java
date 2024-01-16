package TestingListImpleClasses;

import java.util.ArrayList;
import java.util.Collections;

public class TestingArrayList {

	public static void main(String[] args) {
		
		// $ME~ Practicing day5 ArrayList APIS 
		
		ArrayList<Integer> intList = new ArrayList<>();
		System.out.println("Intlist(Empty list) : "+intList);
		
		intList.add(0, 1);
		System.out.println(intList);
		intList.add(2);
		intList.add(3);
		System.out.println(intList);
		System.out.println(intList.size());
		
		System.out.println(intList.get(0));
		System.out.println("---------------------------");
		
		int[] data = {99,88,11,22,33,44,55,66,77,1};
		for(int i:data)
			intList.add(i);
		System.out.println(intList);
		Collections.sort(intList);
		System.out.println(intList);
		intList.add(1);
		System.out.println(intList);
		
		System.out.println(intList.lastIndexOf(1));
		System.out.println("Removed: "+intList.remove(13));
		System.out.println(intList);
		System.out.println("added: "+intList.add(1000));
		System.out.println(intList);
		System.out.println("Replaced: "+ intList.set(0, 999));
		System.out.println(intList);
		System.out.println(intList.contains(999));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
