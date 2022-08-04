package assistproject;

public class Rotatingarray 
{
	
		 public static void main(String[] args)
		 {       
		        int [] arr = new int [] {11, 21, 33, 54, 95,33,55,106};     
		        int n = 5;    
		        System.out.println("Original array: ");    
		        for (int i = 0; i < arr.length; i++) 
		        {     
		            System.out.print(arr[i] + " ");     
		        }       
		        for(int i = 0; i < n; i++)
		        {    
		            int j, last;    
		            last = arr[arr.length-1];   
		            for(j = arr.length-1; j > 0; j--)
		            {    
		                arr[j] = arr[j-1];    
		            }    
		            arr[0] = last;    
		        }    
		        
		        System.out.println();      
		        System.out.println("Array after right rotation: ");    
		        for(int i = 0; i< arr.length; i++)
		        {    
		            System.out.print(arr[i] + " ");    
		        }    
		    }    
		

}
