import java.util.*;


public class StackUse
{
	public static void main(String[] args)
	{
	    
	  Stack<String> sobj= new Stack<String>();
	  
	  sobj.push("India");
	  sobj.push("Us");
	  sobj.push("China");
	  sobj.push("Pakistan");
	   
	  System.out.println(sobj);
	  
	  sobj.pop();
	  
	  System.out.println(sobj);
	  
	  sobj=null;
	}
}
