import java.util.Scanner;


 class Prime
{
    void checkPrime(int no)
    {
        int number=no;
        boolean flag=false;     
       
        
        if(number==0||number==1)
        {  
            System.out.println(number+" is not prime number");      
        }
        else
        {  
            for(int i=2;i<=number;i++)
            {      
                if(number%i==0)
                {      
                    System.out.println(number+" is not prime number");      
                    flag=true;      
                    break;      
                }      
            }
            
        if(flag==false)  
        {
            System.out.println(number+" is prime number"); 
            
        }  
    }
}

public class Main
{    
    public static void main(String args[])
    {    
        Prime pobj= new Prime();
        Scanner sobj= new Scanner(System.in);
        System.out.println("Enter the number which you have to check");
        
        int value=sobj.nextInt();
        
        pobj.checkPrime(value);
        
        
  
    }
}    
}   