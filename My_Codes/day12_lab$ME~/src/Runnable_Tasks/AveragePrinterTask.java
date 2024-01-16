package Runnable_Tasks;

import java.util.stream.IntStream;

public class AveragePrinterTask implements Runnable {

	private int start;
	private int end;
	
		public AveragePrinterTask(int start, int end) {
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
				
				double avg= IntStream.rangeClosed(start, end)  // IntStram : ints -- end
				.average()                                // sepcial case of redduction : terminal op      
				.orElseThrow();               // rets the values  or throws Noshuchelemexp
				System.out.println("Avgerage of given range "+ avg+
						"Printed by: "+ Thread.currentThread().getName());
				
				
				
			}catch(Exception e) {
				System.out.println(Thread.currentThread().getName() + " got exc" +e);
			}
			
			System.out.println(Thread.currentThread().getName()+ "Over");
			
		}// end of run 
		

	}


