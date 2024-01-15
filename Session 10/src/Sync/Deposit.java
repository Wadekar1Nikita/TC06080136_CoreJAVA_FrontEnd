package Sync;

public class Deposit {
	float bal=4000;
	float a;
	float amount;
	public Deposit(float bal, float a, float amount) {
		super();
		this.bal = bal;
		this.a = a;
		this.amount = amount;
	}
	public void deposit(float a,float amount)
	{
		
		float temp;
		temp=bal;
		temp+=amount;
		a=temp;
		try {
			Thread.sleep(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
