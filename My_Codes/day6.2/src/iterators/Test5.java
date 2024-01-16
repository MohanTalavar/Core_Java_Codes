
package iterators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Test5 {                // Using ListIterator

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);//auto boxing 
		list.add(05);
		//attach list itr
		
		System.out.println("====================================");
		
		ListIterator<Integer> litr=list.listIterator();
		while(litr.hasNext())
		System.out.println(litr.next());
		
		//display elems in the list : reverse manner
		
		System.out.println("==================================");
		
		ListIterator<Integer> litr1=list.listIterator(list.size());//litr : after the last elem
		while(litr1.hasPrevious())
			System.out.println(litr1.previous());
		
		System.out.println("==================");

		Collections.sort(list);
		System.out.println("sorted: "+list);
	
		

	}

}
