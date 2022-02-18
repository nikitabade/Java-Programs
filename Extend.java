class Car
{
    protected String brand= "TATA";
    
    public void Fun()
    {
        System.out.println("Inside fun");
        
    }
}

class Vehical extends Car 
{
    public String name="Indica";
    
    public void gun()
    {
        System.out.println("Inside gun");
    }
}

public class Extend
{
    public static void main(String[] args)
    {
        Vehical vobj= new Vehical();
        vobj.Fun();
        vobj.gun();
        
        System.out.println(vobj.brand+ " " + vobj.name);
    }
}    