
public class Player {
	private String PlayerName,PlayerCountry;
	public Player()
	{
		this("INDIA"); //calling parametrised constructor
		PlayerName="Sachine";
	}
	public Player(String PlayerCountry)
	{
		//this();//calling defualt contructor 
		this.PlayerCountry=PlayerCountry;
	}
	
	public String toString() {
		return "Player [PlayerCountry=" +" "+ PlayerCountry +" "+ "PlayerName"+" "+PlayerName+"]";
	}
	public static void main(String args[])
	{
		//Player p=new Player("India");
		Player p=new Player();
		System.out.println(p);
	}
	
}
