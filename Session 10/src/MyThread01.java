
public class MyThread01 extends Thread{
	public MyThread01(ThreadGroup g,String name)
	{
		super(g,name);
		
	}
	public void run()
	{
		
	System.out.println("Child Thread"+Thread.currentThread().getName());
	try {
		Thread.sleep(5000);
		
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
	
	}

}
