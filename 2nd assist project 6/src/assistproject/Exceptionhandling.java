package assistproject;

public class Exceptionhandling {
	public static void main(String[] args) 
	{
		for(int i=0;i<=3;i++)
		{
			try{
				switch(i){
				case 0:
					int m=0;
					int n=20/m;
					break;
				case 1:
					int x[]=null;
					int r=x[4];
					break;
				case 2:
					int a[]=new int[3];
					int b=a[3];
					break;
				}
				
			}
			catch (ArithmeticException r1){
				System.out.println("error occur in case 0----ArithmeticException  :" +r1.getMessage());
			}
			catch(NullPointerException r2){
				System.out.println("error occur in case 1-----NullPointerException :" +r2.getMessage());
			}
			catch(ArrayIndexOutOfBoundsException r3){
				System.out.println("error occur in case 2-----ArrayIndexOutOfBoundsException :" +r3.getMessage());
			}
		}
		
		
		

	}


}
