
public class B extends A{
	public void m1()
	{
		System.out.println("B called");
	}
	public void m2()
	{
	  System.out.println("M2 called");
	}
	public static void main(String args[])
	{
		A b=new B();// polymorphic reference 
		b.getno();
		b.m1();
		((B) b).m2();//overcasting
	}

}
