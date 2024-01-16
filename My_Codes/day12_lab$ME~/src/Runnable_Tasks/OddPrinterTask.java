package Runnable_Tasks;

import java.util.stream.IntStream;

public class OddPrinterTask implements Runnable {

	private int start;
	private int end;
	
		public OddPrinterTask(int start, int end) {
		super();
		this.start = start;
		this.end = end;
		System.out.println("ctor invoked by"+Thread.currentThread().getName()); // main
	}

		//                              RUN ()
		@Override
		public void run() {
			
			System.out.println(Thread.currentThread().getName()+ "Started");
			try {
				
				IntStream.rangeClosed(start, end)  // IntStram : ints -- end 
				.filter(i -> i%2!=0)               //  odd ints in range
				.forEach(i-> System.out.println(Thread.currentThread().getName()+"Printed even no: "+ i));    
				
				
				
			}catch(Exception e) {
				System.out.println(Thread.currentThread().getName() + " got exc" +e);
			}
			
			System.out.println(Thread.currentThread().getName()+ "Over");
			
		}// end of run 
		

	}


