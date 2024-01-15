//clone use for creating a copy of object for that we have to implement clonable 
public class Clone1 implements Cloneable {
	private int emiId;
	private String name;
	public Clone1(int emiId,String name)
	{
		this.emiId=emiId;
		this.name=name;
		
	}
	@Override
	public String toString() {
		return "Clone1 [emiId=" + emiId + ", name=" + name + "]";
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	public static void main(String args[]) throws CloneNotSupportedException
	{
		Clone1 n=new Clone1(1,"nikita");
		System.out.println(n);
		Clone1 n1= (Clone1) n.clone();//here we have to do the type casting beacause it show 
		//object type but we want to Clone1 type object  
		System.out.println(n1);
		
	}
	

}
