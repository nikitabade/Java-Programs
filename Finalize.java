import java.lang.*;

class Demo
{
    public String Name;
    public String Batch;
    
    public Demo(String x, String y)
    {
        this.Name=x;
        this.Batch=y;
    }
    
    public String toString()
    {
        return this.Name+" "+this.Batch;
    }
    
    protected void finalize()

    {
        System.out.println("inside finalize method");
    }
}



public class Finalize 
{   
    public static void main(String arg[])

    {
        Demo obj1= new Demo("Rahul","PPA");
        Demo obj2=new Demo("Amit","Python");
        
       System.out.println("hashcode of obj1 is:"+obj1.hashCode());
        System.out.println("hashcode of obj1 is:"+obj2.hashCode());
        System.out.println(obj1.toString());
        
        Class cobj= obj1.getClass();
        System.out.println("Name of class is:"+cobj.getClass());
        obj1= null;
        obj2= null;
        System.gc();
        
    }
}