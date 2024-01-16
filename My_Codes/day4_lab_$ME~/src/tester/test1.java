package tester;

import com.app.core.Emp;
import com.app.core.PermanentWorker;
import com.app.core.SalesMgr;
import com.app.core.TempWorker;

public class test1 {

	public static void main(String[] args) {
		
		Emp e= new SalesMgr(); // upcasting
		e.computeSalary();
		System.out.println(e.getClass());
		System.out.println(e.computeSalary());
		
		System.out.println("==============================");
		
		e =  new TempWorker();
		System.out.println(e.getClass());
		System.out.println(e.computeSalary());
		
		System.out.println("===============================");	
		Object ref;
		ref=e; // upcasting
		System.out.println(ref.getClass());
		//ref.computSalary(); // compiler goes by type of ref not type of obj
		
		System.out.println("===============================");
		
//		System.out.println();
		System.out.println(((Emp)ref).computeSalary());
		System.out.println(((TempWorker)ref).computeSalary());
//		
//		if(ref instanceof PermanentWorker)
//		System.out.println(((PermanentWorker)ref).computeSalary());
//		else
//			System.out.println("Not the permanent worker!");
		
	}// end of main
}
