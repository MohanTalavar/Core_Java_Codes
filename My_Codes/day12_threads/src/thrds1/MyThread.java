package thrds1;
//extends scenario
public class MyThread extends Thread{
	
	public MyThread(String name) {
		super(name);//State : NEW
		System.out.println("Constructor invoked by "+    Thread.currentThread().getName());  // main
	}
	
	@Override
	public void run()                                         // template to write threads
	{
		System.out.println(getName()+" strted");
		//exec logic : for loop
		try {
			for(int i=0;i<10;i++) {
				System.out.println(getName()+" exec # "+i);
				Thread.sleep(500);                              // blocking trigger
			}
		}catch (Exception e) {
			System.out.println(getName()+" got exc "+e);
		}
		System.out.println(getName()+" over");
	}

}
