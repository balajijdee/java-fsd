package moiveticket;

import java.util.Scanner;

public class Usernameandpassword 
{
	public static void main(String[] args) {
		System.out.println("welcome to movie booking");
		useridverification();
		
	}
	private static void useridverification() {
	    String s = "ABCD";
	    int b =1234;
	    System.out.println("enter the user id ");
	    try (Scanner sc = new Scanner(System.in)) {
			String userid =  sc.next();
			System.out.println("enter the password ");
			try (Scanner sd = new Scanner(System.in)) {
				int password =  sd.nextInt();
				
				if(s == userid && b == password)
				{
						 System.out.println("sucssesfully loged in ");
				}
					else
					{
						System.out.println("Enter the valid userid and password ");
						useridverification();
					}
				}
			}
	}
}
        
	    
		
	


