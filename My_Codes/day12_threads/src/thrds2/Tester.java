package thrds2;
import static java.lang.Thread.*;

public class Tester {            // Orphans when the main thread is dead but the childs are still running !!! 

	public static void main(String[] args) throws InterruptedException{
		System.out.println("main thrd details "+ Thread.currentThread());// Thread [main,5,main]
		//create runnable task instance
		MyRunableTask task=new MyRunableTask();
//		Thread t0=new Thread();                   empty run method , starts and ends 
//		t0.start();
		// create child thrds
		
		//Thread(Runnable target, String name )  const being used
		
		Thread t1=new Thread(task,"one");
		Thread t2=new Thread(task,"two");
		Thread t3=new Thread(task,"three");
		Thread t4=new Thread(task,"four");//How many runnable thrds ? 1 | these 4 are in heap before start()
		
		t1.start();
//		t1.start();  java.lang.IllegalThreadStateException |  when u are trying to start already started thrd or dormant thrd!!
//		t1.start();
		t2.start();
		t3.start();
		t4.start();// RUNNABLE : 1(parent)+4(child)
		for (int i = 0; i < 10; i++) {
			System.out.println(currentThread().getName() + " exec # " + i);
			sleep(100);
		}
		
		System.out.println("main sending the interrupt signal to t1");
		t1.interrupt();
		
		
		//=========================================================
		System.out.println("t1 stausL "+t1.isAlive());  //f
		//t1.start(); // main thrd will get illegelalthrdstateexp
		//java.lang.IllegalThreadStateException
		
		// to handle orphan threads
		System.out.println("t1 status : "+t1.isAlive());
		t1.join();  // main : Blocked on join(i.e main waiting for t1 to complete execution)
		System.out.println("t1 status: "+ t1.isAlive());
		t2.join();
		t3.join();
		t4.join();
		System.out.println("main over......");

	} // Ques. when the main thread become dead : when the main method returns!!1
	   

}
