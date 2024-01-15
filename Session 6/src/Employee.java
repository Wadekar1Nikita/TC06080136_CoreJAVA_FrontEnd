
public class Employee {
	private int EmpNo;
	private int salary;
	private static int totalsalary;
	private static int count;
	public Employee() {}
	public Employee(int EmpNo,int salary)
	{
		this.EmpNo=EmpNo;
		this.salary=salary;
		totalsalary+=salary;
		count++;
	}
	
	@Override
	public String toString() {
		return "Employee [EmpNo=" + EmpNo + ", salary=" + salary + ", totalsalary=" + totalsalary + "]";
	}
	
	
	public static int getcount()
	{
		return count;
	}
	public static void main(String args[])
	{
		Employee e=new Employee(1,1000);
		Employee e1=new Employee(2,2000);
		Employee e2=new Employee(3,1800);
		System.out.println("total salary:"+totalsalary);
		
	}
	

}
