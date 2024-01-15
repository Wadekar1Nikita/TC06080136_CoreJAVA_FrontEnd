import java.util.Scanner;

public class Student {
	private int rollno;
	private int age;
	private int score;
	
	Student(){}
	public Student(int rollno, int age, int score) {
		
		this.rollno = rollno;
		this.age = age;
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", age=" + age + ", score=" + score + "]";
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student s[]=new Student[5];
		for(int i=0;i<10;i++)
		{
			int rollno=sc.nextInt();
			int age=sc.nextInt();
			int score=sc.nextInt();
			s[i]=new Student(rollno,age,score);
		}
		for(int i=0;i<s.length;i++)
		{
			if(s[i].score>=0 && s[i].score<=50)
			{
				System.out.println(s[i]);
			}
			else if(s[i].score>=51 && s[i].score<=65)
			{
				System.out.println(s[i]);
			}
			else if(s[i].score>=66 && s[i].score<=80)
			{
				System.out.println(s[i]);
				
			}
			else
			{
				System.out.println(s[i]);
			}
		}
	}
	
			
}
