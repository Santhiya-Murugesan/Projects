import java.util.*;   
class PalindromeExample 
{  
   public static void main(String args[])  
   {  
      String original, reverse = "";   
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter the number or String");  
      original = in.nextLine();   
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i); 
	System.out.println("reverse is:"+reverse); 
      if (original.equals(reverse))  
         System.out.println("The number palindrome");  
      else  
         System.out.println("The number is not palindrome");   
   }  
}  