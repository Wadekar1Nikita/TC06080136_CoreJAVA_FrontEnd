
public class EnumDemo {
	public enum Season{SUMMER,WINTER,RAINY};// they should be always in upper case 
	public static void main(String args[])
	{
		Season s=Season.SUMMER;
		System.out.println(s);
		for(Season s1:Season.values())
		{
			System.out.println(s1+" "+s1.ordinal());//index value will be printed if we used .ordinal() 
		}
	}
}
