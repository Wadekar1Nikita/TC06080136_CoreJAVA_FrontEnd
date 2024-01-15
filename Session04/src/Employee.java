//containment
//one object is a part of another object 
public class Employee {
	private int empNO;
	private String empName;
	private Date dt_of_joining;
	public Employee() {}
	public Employee(int empNO, String empName, Date dt_of_joining) {
		
		this.empNO = empNO;
		this.empName = empName;
		this.dt_of_joining = dt_of_joining;
	}
	@Override
	public String toString() {
		return "Employee [empNO=" + empNO + ", empName=" + empName + ", dt_of_joining=" + dt_of_joining + "]";
	}
	 public static void main(String args[])
	 {
		 Employee e=new Employee(101,"nikita",new Date(19,10,2023));
		 System.out.println(e);//it called the to string method
	 }

}
