package assistproject;

import java.io.File;

public class Delete {
	public static void main(String[] args) 
	{
		File a =new File("Demo//Test2.txt");
		a .delete();
		boolean sol = a.exists();
		System.out.println("File Present: "+ sol);
	}

}
