//Singleton Design Pattern

class Singleton
{
    public int x, y;
    
    private static Singleton obj= new Singleton();
    
    private Singleton()
    {
        System.out.println("Inside Constructure");
    }
    
    public static Singleton GetObject()
    {
        return obj;
    }
}

public class SingletonCls
{
	public static void main(String[] args) 
	{
	    //Singleton obj= new Singleton();     // not allowed because it is private
	    Singleton sobj= Singleton.GetObject();
	    Singleton sobj2= Singleton.GetObject();
	
	}
}
