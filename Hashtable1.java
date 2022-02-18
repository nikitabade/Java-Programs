import java.util.*;


public class Hashtable1
{
	public static void main(String[] args) 
	{ 
	   
	     Hashtable<String,Integer> hobj = new Hashtable<String,Integer>();
	     hobj.put("PPA",1500);
	     hobj.put("LB",1300);
	     hobj.put("Python",12300);
	     hobj.put("Angular",5100);
	     hobj.put("C#",5122);
	   
	    System.out.println(hobj.get("LB"));
	    System.out.println("Data from Hashtable");
	   
	    Enumeration eobj= hobj.keys();
	   
	    while(eobj.hasMoreElements())
	    {
	        System.out.println(eobj.nextElement());
	    }
	     hobj= null;

	}
}