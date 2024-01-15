
public class Student {
	private int rollno;
	private String Name;
	private static int count;
	private static String clgName="JSCOE";
	public Student() {}
	public Student(int rollno,String Name)
	{
		this.rollno=rollno;
		this.Name=Name;
		count++;
	}
	public static int getcount()//static method
	{
		return count;
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", Name=" + Name + "]";
	}

	static//static block
	{
		System.out.println("Static block");
		count=10;
	}
	
	public static void main(String args[])
	{
		Student s1=new Student(1,"niku");
		Student s2=new Student(2,"Abhi");
		Student s3=new Student(3,"papu");
		System.out.println("main method");
		System.out.println(Student.getcount());
		System.out.println(Student.clgName);
	}
	
	
	

}
