//..................................assigment2.......................................
//Create a class MathOperation containing method 'Multiply'to calculate multiplication of following arguments
//a.two integers
//b.three float
//c.all element of array
//d.one double and one integer
import java.util.Scanner;
public class MathOP {
	private int x,y,R;
	private float a,b,c,E;
	private double p;
	private int q;
	public void init()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two integers:");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("Enter three floats:");
		a=sc.nextFloat();
		b=sc.nextFloat();
		c=sc.nextFloat();
		System.out.println("Enter double :");
		p=sc.nextDouble();
		q=sc.nextInt();
		
	}
	public int Multiply()
	{
		return x*y;	
	}
	
	public float Multiply(float a, float b, float c)
	{
		
//		this.a = a;
//		this.b = b;
//		this.c = c;
		return a*b*c;
		
	}
	public double Multiply(double p,int q)
	{
		return p*q;
	}
	public static void main(String args[])
	{
		MathOP m1=new MathOP();
		m1.init();
		System.out.println(m1.Multiply());
		System.out.println(m1.Multiply(1.1f,1.0f, 1.1f));
		System.out.println(m1.Multiply(1.0,2));
		
	}

}
