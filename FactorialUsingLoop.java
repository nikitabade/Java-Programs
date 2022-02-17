import java.util.Scanner;  

class Factorial
{  
    void Display(int number)
    {
        int fact=1;  
        
        for(int i=1;i<=number;i++)
        {    
            fact=fact*i;    
        }    
        System.out.println("Factorial of "+number+" is: "+fact);    
    }  
}  

class FactorialUsingLoop
{  
   public static void main(String args[])  
   {  
      Scanner sobj = new Scanner(System.in);   
      System.out.println("Enter the number");  
      int no = sobj.nextInt(); 
      
      Factorial fobj= new Factorial();
      fobj.Display(no);
      
   }  
}  