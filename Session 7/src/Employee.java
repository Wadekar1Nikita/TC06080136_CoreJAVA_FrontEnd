import java.util.Objects;

//....................................assign2.............................
//explain imp of tostring() and equals() method of object class and overriden them on class Employee(empId,name,salary)
//a.create class for main method and accept five employee info and store in an array.also ensures if entered empId already exist or not 
//b.display all employee info using tostring method
public class Employee {
	private int empId;
	private String name;
	private int salary;
	public Employee() {}
	public Employee(int empId,String name,int salary)
	{
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(empId, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId && Objects.equals(name, other.name) && salary == other.salary;
	}
	public static void main(String args[])
	{ 
		int size=5;
		for(int i=0;i<size;i++)
		{
			
		}
		
	
		
		
		
	}
	

}
