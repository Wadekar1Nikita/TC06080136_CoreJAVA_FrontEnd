import java.util.Scanner;

public class Floor {
	int length;
	int width;
	Floor()
	{}
	
	public Floor(int legnth, int width) {
		super();
		this.length =length;
		this.width = width;
	}

	public void totalTiles(Tile t)
	{
		double tileArea=t.getArea();
		double floorArea=length*width;
		double noofTile=floorArea/tileArea;
		
		System.out.println("No of tile:"+noofTile);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tilelength=sc.nextInt();
		Tile t=new Tile(tilelength);
		int length=sc.nextInt();
		int width=sc.nextInt();
		Floor f=new Floor(length,width);
		f.totalTiles(t);
		
	}
}
