
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
	public static void Swap(Date []d)
	{
		Date temp;
		temp=d[0];
		d[0]=d[1];
		d[1]=temp;
	}
	public static void main(String args[])
	{
		Date[] d=new Date[2];
		d[0]=new Date(20,10,2023);
		d[1]=new Date(22,11,2023);
		System.out.println("Before Swapping:");
		System.out.println("d1="+d[0]);
		System.out.println("d2="+d[1]);
		Date.Swap(d);
		System.out.println("After Swapping:");
		System.out.println("d1="+d[0]);
		System.out.println("d2="+d[1]);
		
	}
	

}



