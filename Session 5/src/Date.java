
public class Date {
	private int d,m,y;
	public Date()
	{
		
	}
	public Date(int d, int m, int y) {
		
		this.d = d;
		this.m = m;
		this.y = y;
	}
	@Override
	public String toString() {
		return "DateDemo [d=" + d + ", m=" + m + ", y=" + y + "]";
	}
	public static void Swap(Date d1,Date d2)
	{
		Date temp;
		temp=d1;
		d1=d2;
		d2=temp;
	}
	public static void main(String args[])
	{
		Date d1=new Date(20,10,2023);
		Date d2=new Date(22,10,2023);
		System.out.println("Before Swapping:");
		System.out.println("d1="+d1);
		System.out.println("d2="+d2);
		System.out.println("After Swapping:");
		System.out.println("d1="+d1);
		System.out.println("d2="+d2);
		
	}
	

}

