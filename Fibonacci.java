import java.util.Scanner;

class FibonacciPrint
{
    int num1=0,num2=1,num3=0;
    
    void Display(int count)
    {
        System.out.print(num1+" "+num2);    
    
        for(int i=2;i<count;++i)
        {    
            num3=num1+num2;    
            System.out.print(" "+num3);    
            num1=num2;    
            num2=num3;    
        }    
    }
}
class Fibonacci
{  
    public static void main(String args[])  
    {    
        FibonacciPrint fobj= new FibonacciPrint();
        Scanner sobj= new Scanner(System.in);
        
        System.out.println("how many number you have to display");
        
        int value=sobj.nextInt();
        
        fobj.Display(value);
  
    }
    
}  