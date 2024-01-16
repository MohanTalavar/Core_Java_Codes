package testingAL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> l1 = new ArrayList<Integer>();
		System.out.println("empty list" + l1);// empty arraylist

		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);

		System.out.println("entire list one liner:");
		System.out.println(l1);

		System.out.println("with foreach:");
		for (int i : l1)
			System.out.println(i);

		System.out.println("Using iterator: ");
		Iterator<Integer> itr = l1.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		System.out.println("Added elems using arrays.aslist");
		l1.addAll(Arrays.asList(60, 70, 80, 90, 100));
		/* Iterator<Integer> */ itr = l1.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("----------");
		System.out.println(l1.get(90));

	}

}
