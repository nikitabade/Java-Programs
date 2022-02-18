class Outerclass
{
    int no=10;
    
    class Innerclass
    {
         int value=20;
    }
}

public class NestedClass
{
    public static void main(String [] args)
    {
        Outerclass oobj= new Outerclass();
        
        Outerclass.Innerclass iobj= oobj.new Innerclass();
        
        System.out.println("value of no is :" + oobj.no +"    value of value is : "+ iobj.value);
    }
}