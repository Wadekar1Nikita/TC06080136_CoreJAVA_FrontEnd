
public class Voter {
	private int voterid;
	private String name;
	private int age;
	Voter()
	{}
	public Voter(int voterid, String name, int age)  {
		super();
		this.voterid = voterid;
		this.name = name;
		this.age = age;
		
		try
		{
			if(age<18);
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	public static void main(String[] args) throws InvalidAgeException {
		Voter v=new Voter(12,"Nikita",19);
		
		
		
		
	}
	

}
