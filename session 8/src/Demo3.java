import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Demo3 {
	public static void main(String args[]) throws FileNotFoundException
	{
		FileOutputStream fos=null;
		try {
			System.out.println("In try");
			fos=new FileOutputStream("d://mno.txt");
			fos.write(97);
			fos.close();
		}
		catch(Exception e)
		{
	            System.out.println(e);
		}

}
}
