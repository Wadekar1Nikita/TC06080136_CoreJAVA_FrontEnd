
public class Mythread1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		Mythread1 m1=new Mythread1();
		Thread t1=new Thread(m1);
		Mythread1 m2=new Mythread1();
		Thread t2=new Thread(m2);
		Mythread1 m3=new Mythread1();
		Thread t3=new Thread(m3);
		
		t1.start();
		t2.start();
		t3.start();
	}
	
	

}
