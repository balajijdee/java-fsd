package casting;
import java.util.Scanner;
public class type_casting {
public static void main(String[] args) {
				int a;
				Scanner d = new Scanner(System.in);
				System.out.print("Enter a numbers : ");
				a=d.nextInt();
				long b=a;
				float c=b;
				System.out.println("casting before,int value:" +a);
				System.out.println("casting after ,long value:" +b);
				System.out.println("casting after ,float value:" +c);
			}

	}


