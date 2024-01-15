
public class ThreadTest {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		//system 
		
		ThreadGroup g1=new ThreadGroup("First Group");
		System.out.println(g1.getParent().getName());
		
		ThreadGroup g2=new ThreadGroup(g1, "Second");
		System.out.println(g2.getParent().getName());
		
	
	}
}
