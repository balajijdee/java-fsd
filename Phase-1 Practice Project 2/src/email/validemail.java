package email;
import java.util.regex.*;    
import java.util.*; 

public class validemail {  
	    public static void main(String args[]){  
	        ArrayList<String> emails = new ArrayList<String>();  
	        emails.add("balaji@gmail.co.in");  
	        emails.add("balaji@gmail.com");  
	        emails.add("balaji.name@gmail.com");  
	        emails.add("balaji#@gmail.co.in");  
	        emails.add("balaji@gmail.com");  
	        emails.add("balaji@gmailcom");  
	        emails.add("@yahoo.com");  
	        emails.add("balaji#gmail.com");    
	        String regex = "^(.+)@(.+)$";   
	        Pattern pattern = Pattern.compile(regex);    
	        for(String email : emails){  
	            Matcher matcher = pattern.matcher(email);  
	            System.out.println(email +" : "+ matcher.matches()+"\n");  
	        }  
	    }  
	}  

