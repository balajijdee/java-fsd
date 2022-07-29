package assistproject;

public class Throw
{
		public void method1()throws Exception
		{
			String str=null;
			System.out.println(str.length());		
		}
		public void method2()
		{
			try
			{
			method1();
			}
			catch(Exception ae)
			{
				System.out.println("Exception handled : " +ae.getMessage());
			}
		}
		public static void main(String[] args) 
		{
			Throw in=new Throw();
			in.method2();
		}
}
