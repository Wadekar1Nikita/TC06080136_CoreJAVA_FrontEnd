//...................................assignment1.................................
//create a class MathOperation with two data members X and Y to store the operand 
//and third data member R to store result of operation.
//create method member
//init-to input X and Y from users
//add-to add X and Y store in R
//multiply -to multiply X and Y and store in R
//power-to calculate x^y and store in R
//display-to display Result R
import java.util.Scanner;
import java.math.*;
public class MathOperation {
	private int X,Y,R;
	public void init()
	{ 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Math operation");
		System.out.println("Enter value of X:");
		X=sc.nextInt();
		System.out.println("Enter value of Y:");
		Y=sc.nextInt();	
		
	}
	public void add()
	{
		R=X+Y;
	}
	public void multiply()
	{
		R=X*Y;
	}
	public void Power()
	{
		R=(int) Math.pow(X, Y);
	}
	public void Display()
	{
		System.out.println(R);
	}
	public static void main(String args[])
	{
		MathOperation m1=new MathOperation();
		m1.init();
		m1.add();
		m1.Display();
		
				
	}

}
