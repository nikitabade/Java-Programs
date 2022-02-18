// write the program which accept number from user and print even factors of that number
import java.util.*;

class Factors
{
        
    void DisplayFactor(int iNo)
    {
        
    	int i=0;
	
	    if(iNo<0)
	    {
		    iNo=-iNo;
	    }
	
	    for(i=1; i<iNo; i++)
	    {
		    if(((iNo%i)==0) && ((i%2)==0))
		    {
			       System.out.print(i+"  ");
		    }
	    }
    }
}

class EvenFactor
{
    public static void main(String[] args)
    {
        
        Scanner sobj= new Scanner(System.in);
    
        System.out.println("Enter the number");
    
        int iValue=sobj.nextInt();
    
        Factors fobj= new Factors();
	
	fobj.DisplayFactor(iValue);
    }
}
