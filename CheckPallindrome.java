import java.util.Scanner;  

class Pallindrome
{
    String reverse="";
    
    void checkPallindrome(String original)
    {
        int length = original.length();   
        
        for ( int i = length - 1; i >= 0; i-- )  
        {
            reverse = reverse + original.charAt(i);  
        }
        
        if (original.equals(reverse)) 
        {
         System.out.println("Entered string/number is a palindrome.");  
        }
        else  
        { 
            System.out.println("Entered string/number is not a palindrome.");
        }
    }
}
class CheckPallindrome
{  
   public static void main(String args[])  
   {  
      String str, reverse = ""; 
      
      Scanner sobj = new Scanner(System.in);   
      System.out.println("Enter a string/number to check if it is a palindrome");  
      str = sobj.nextLine(); 
      
      Pallindrome pobj= new Pallindrome();
      pobj.checkPallindrome(str);
      
   }  
}  