import java.util.*;

public class FirstRepeatCharacter
{
    
    
    static char FirstRepetatingChar(char arr[])
    {
        HashSet<Character> hs= new HashSet<> ();
        
        for(int i=0; i<arr.length; i++)
        {
            char c= arr[i];
            
            if(hs.contains(c))
            {
                return c;
            }
            else
            {
                hs.add(c);
            }
        }
        return '\0';
    }
    
   public static void main(String args[])
   {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the String : ");
       String strr= sc.nextLine();
       
        char[] st= strr.toCharArray();
        char Ret=FirstRepetatingChar(st);
        System.out.println("First repeating character is : " +Ret);
       
   }

   
}