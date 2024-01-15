
public class Employee {
	private int empID;
	private String empName;
	private float empSal;
	public Employee()
	{
		System.out.println("default constructor is invoked");
	}
	public Employee(int empID,String empName,float empSal )
	{
		System.out.println("parameterized constructor is invoked");
		this.empID=empID;
		this.empName=empName;
		this.empSal=empSal;
	}
	public String toString()
	{
		return empID+" "+empName+" "+empSal;
	}
	public static void main(String args[])
	{
		Employee e1=new Employee();
		System.out.println(e1);
		Employee e2=new Employee(101,"Nikita",1000000.0f);
		System.out.println(e2);
	}

}
