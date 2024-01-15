
public class ThreadGroupDemo {
	public static void main(String[] args) throws InterruptedException {
		ThreadGroup pg=new ThreadGroup("Parentgroup");
		ThreadGroup cg=new ThreadGroup("Chikd group");
		MyThread01 t1=new MyThread01(pg, "First");
		MyThread01 t2=new MyThread01(cg, "Second");
		t1.start();
		t2.start();
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		Thread.sleep(10000);
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		
	}

}
