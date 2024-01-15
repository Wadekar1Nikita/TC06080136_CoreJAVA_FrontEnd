//member inner class 
public class Outer {
	private int no=100;
	public class Inner
	{
		int no=1000;
		public void getNo()
		{
			
			int no=10;
			System.out.println("no:"+no);
			System.out.println("no="+Inner.this.no);
			System.out.println("no:"+Outer.this.no);
		}
	}
//	public void get()
//	{
//		//here we can also create a object of inner class
//		this.no=no;
//		System.out.println("no="+no);
//		Inner i=new Inner();
//		i.getNo();
//	}
	
	public static void main(String args[])
	{
		Outer o=new Outer();
		Inner i=o.new Inner();
		i.getNo();
		//Inner i=new Outer().new Inner();
		//i.getNo();
		
	}

}
