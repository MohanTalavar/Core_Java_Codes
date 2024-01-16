package tester;

import java.util.Scanner;

import Runnable_Tasks.AveragePrinterTask;
import Runnable_Tasks.EvenPrinterTask;
import Runnable_Tasks.OddPrinterTask;

public class test_concurrency {

	public static void main(String[] args) {
		
		//
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.println("Enter range: begin n end");
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			// create tasks , aatch a thread to task, start the thrd
			// implments Runnable : thread (Runnable task, string name )
			
			Thread t1 = new Thread(new EvenPrinterTask(start, end), "even");
			Thread t2 = new Thread(new OddPrinterTask(start, end), "Odd");
			Thread t3 = new Thread(new AveragePrinterTask(start, end), "Average");
			
			// t1 t2 t3 happily sitting in the heap
			
			// start the threads
			
			t1.start();
			t2.start();
			t3.start();
			System.out.println("Main waitn for child threads to complete there execution ");
			t1.join();
			t2.join();
			t3.join();	
			      		
		}catch(Exception e) {
			e.printStackTrace();
		}

		System.out.println("Main over ..!!!");
	}

}
