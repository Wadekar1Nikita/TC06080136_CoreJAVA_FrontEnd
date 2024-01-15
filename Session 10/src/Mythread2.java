
public class Mythread2 extends Thread{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" "+
	
				Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		Mythread2 t1=new Mythread2();
		
		Mythread2 t2=new Mythread2();
		
		Mythread2 t3=new Mythread2();
		
//		t1.setName("one");
//		t2.setName("two");
//		t3.setName("three");
//		
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		t3.setPriority(NORM_PRIORITY);
		
		
		
		
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
