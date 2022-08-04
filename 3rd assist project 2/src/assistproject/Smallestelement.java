package assistproject;
import java.util.Arrays;
public class Smallestelement 
{
	public static int fourththSmallest(Integer[] arr,
            int fourthsmallestno)
	{
		Arrays.sort(arr);
		return arr[fourthsmallestno - 1];
	}
		public static void main(String[] args)
		{
				Integer arr[] = new Integer[] {12,9,5,7,19,55,66,33 };
				int fourthsmallestno = 4;
				System.out.print("fourth smallest element is " + fourththSmallest(arr, fourthsmallestno));
		}
}
