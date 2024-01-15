

//run time stack exception
public class Demo {
	public static void getmsg()
	{
		msg();
	}
	public static float msg()
	{
		return 10/0;
	}
	public static void main(String args[])
	{
		getmsg();
	}

}
