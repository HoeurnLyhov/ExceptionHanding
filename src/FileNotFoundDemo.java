import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileNotFoundDemo 
{

	public static void main(String[] args) 
	{
		byte b[]=new byte[200];
		try
		{
			FileInputStream fis=new FileInputStream("D:\\Mr.vikness\\3.tx");
			System.out.println("Success...FIle opened");
			fis.read(b);
		}
		catch(FileNotFoundException e)
		{
			/*String cName=e.getClass().toString();
			System.out.println(cName);*/
			
			System.out.println("Exception occurred "+e.getMessage());
		}
		catch(IOException ioe)
		{
			System.out.println("Not able to read file");
		}

	}

}
