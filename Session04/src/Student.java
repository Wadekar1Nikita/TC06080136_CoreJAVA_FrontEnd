import java.util.Scanner;
public class Student {
	private int rollno;
	private String name;
	private int m1,m2,m3;
	public Student() {}
	public Student(int rollno, String name, int m1, int m2, int m3) {
		
		this.rollno = rollno;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	
	
	public int getRollno() {
		return rollno;
	}
	public String getName() {
		return name;
	}
	public int getM1() {
		return m1;
	}
	public int getM2() {
		return m2;
	}
	public int getM3() {
		return m3;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", m1=" + m1 + ","
				+ " m2=" + m2 + ", m3=" + m3 + "]";
	}
	//main-student array
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		Student[] s=new Student[size];
		for (int i=0;i<s.length;i++)
		{
			System.out.println("Enter roll  no:");
			int r=sc.nextInt();
			System.out.println("Enter name:");
			String a=sc.next();
			System.out.println("marks:");
			int p=sc.nextInt();
			int q=sc.nextInt();
			int l=sc.nextInt();
			s[i]=new Student(r,a,p,q,l);
		}
		
		
	}
	

}
