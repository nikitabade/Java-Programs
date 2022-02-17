import java.util.Scanner;  

class Factorial
{  
    static int Display(int number)
    {    
        if (number == 0)    
        return 1;    
        else    
        return(number * Display(number-1));    
    }
    
}

class FactorialUsingRecursion
{  
   public static void main(String args[])  
   {  
      Scanner sobj = new Scanner(System.in);   
      System.out.println("Enter the number");  
      int no = sobj.nextInt(); 
      
      Factorial fobj= new Factorial();
      int fact = fobj.Display(no);
      
      System.out.println("Factorial of "+no+" is: "+fact);    
      
   }  
}  