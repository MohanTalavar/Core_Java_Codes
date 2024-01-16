package GenericNonGeneric;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class testingGenericNongenMethods { // using gen methods to iterate

	public static <T> void print(Collection<T> coll) {
		for(T o :coll)
			System.out.println(o);
	}
	
	public static void printNongen(Collection<?> coll) {
		for(Object o :coll)
			System.out.println(o);
	}
	
	
	public static void main(String[] args) {
		
		//==================== Using List 
		
		List<Integer> intList = new ArrayList<>(Arrays.asList(111,222,333,444));
		System.out.println("IntList: "+intList);
		System.out.println("using gen method: " ); 
		print(intList);
		
		//===================== Using LinkedList
		
		LinkedList<Double> dubll = new LinkedList<>(Arrays.asList(10.0,11.0,22.0));
		System.out.println("DoubleLinkedList: "+dubll);
		System.out.println("using gen method to iterate ");
		print(dubll);
		
		//===================== Using HashSet
		
		Set<Integer> setList = new HashSet<>(Arrays.asList(99,90,77,88));
		System.out.println("setList: "+ setList);
		System.out.println("using Non gen method: ");
		printNongen(setList);
		
		//=========================================
		System.out.println("================================");
		System.out.println("Shuffle on intList: ");
		Collections.shuffle(intList);
		print(intList);
		
		//================
		
		System.out.println("====================  Copy ==========================");
		List<Integer> l1 = new LinkedList<>(Arrays.asList(100,2,3,4,6,4,4,4,4,4));
		
		List<Integer> l2 = new LinkedList<>(Arrays.asList(999,23,333,422,633));
		
		Collections.copy(l1, l2);
		
		print(l1);
		System.out.println(l1);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
