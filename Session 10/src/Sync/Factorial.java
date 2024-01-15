package Sync;

public class Factorial {
	public synchronized void fact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			System.out.println(fact);
		}
		System.out.println("fact="+fact);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
				
	}


