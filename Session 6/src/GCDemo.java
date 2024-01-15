
public class GCDemo {
	protected void finalize() throws Throwable
	{
		super.finalize();
		System.out.println("object garbage collection");
		
	}
	public static void main(String args[])
	{
		GCDemo g1=new GCdemo();
		
	}

}
