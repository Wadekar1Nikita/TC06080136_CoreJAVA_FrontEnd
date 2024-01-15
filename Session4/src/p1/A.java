package p1;

public class A {
     //int no=10;//default members are accessble within a package
	//private int no=10;//private members accesible within a class
     // protected int no=10//protected members accessible outside the package with use of inheritance
	//using extends keyword we use the protected 
	public int no=10;//public members are accessible outside the pkg,inside the pkg,inside the class.outside the class
	//that means it can be accessible everywhere 
	private void getNo()
	{
		System.out.println("no="+no);
		
	}
	public static void main(String args[])
	{
		A a=new A();
		System.out.println(a.no);
		a.getNo();
	}

}
