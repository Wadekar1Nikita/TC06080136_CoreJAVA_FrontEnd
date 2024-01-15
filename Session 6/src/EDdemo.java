
public class EDdemo {
	public enum Coffee{SMALL(50),MEDIUM(70),LARGE(90);
		int price;
		Coffee(int price)
		{
			this.price=price;
		}
		public int getPrice()
		{
			return price;
		}
	};
	public static void main(String args[])
	{
		Coffee c=Coffee.MEDIUM;
		//using for each loop 
		for(Coffee a:Coffee.values())
		{
			System.out.println(a+" "+a.ordinal());
		}
		System.out.println(c+" Rs."+c.getPrice());
	}
	
}
