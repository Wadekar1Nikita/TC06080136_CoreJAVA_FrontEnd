import java.io.*;
public class Demo4 {
	public static void main(String args[]) throws IOException
	{
		//ARM
		try(FileOutputStream fos=new FileOutputStream("d://mno.txt");) 
		{
			System.out.println("In try");
			String str="Nikita Wadekar";
			byte b[]=str.getBytes();
			
			fos.write(b);
			
		}
		catch(Exception e)
		{
	            System.out.println(e);
		}
		finally
		{
			System.out.println("In finally");
		    //fos.close();
			
		}

}
}
