package assitsproject;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Updateandread {
	public static void main(String[] args) 
	{
		File a = new File("Demo\\Test3.txt");
		try {
			a.createNewFile();
			FileWriter wrt = new FileWriter(a);
			wrt.write(97);
			wrt.write("\nHELLO EVERYONE");
			wrt.flush();
			wrt.close();
			FileReader fr = new FileReader(a);
			int output = fr.read();
			while(output!=-1)
			{
				System.out.print((char) output);
				output = fr.read();
			}
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
