import java.util.Scanner;

public class Factorialdemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int fact=1;
		for(int i=1;i<num+1;i++)
		{
			fact=fact*i;
			System.out.println(fact);
		}
	}

}
