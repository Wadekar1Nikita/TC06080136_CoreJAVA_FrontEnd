
public class Test11 {
	public static void main(String[] args) {
		ThreadGroup g1=new ThreadGroup("Tg");
		Thread t1=new Thread(g1,"First Thread");
	    Thread t2=new Thread(g1,"Second");
	    System.out.println(g1.getMaxPriority());
	    g1.setMaxPriority(3);
	    Thread t3=new Thread(g1," Third Thread ");
	    System.out.println(t1.getPriority());
	    System.out.println(t2.getPriority());
	    System.out.println(t3.getPriority());
	}
}
