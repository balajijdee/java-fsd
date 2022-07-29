package assistproject;

import java.io.File;
import java.io.IOException;

public class create 
{
	public static void main(String[] args) 
	{
		File a= new File("Demo\\Test2.txt");
		boolean value=a.exists();
		System.out.println("Folder Present : "+ value);
		if(value==false)
			try 
		    {
			 boolean created= a.createNewFile();
			 System.out.println("File Created :"+ created);
			}
			catch(IOException e)
		{
				e.printStackTrace();
		}
	}
}

