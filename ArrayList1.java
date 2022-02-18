import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1
{
    public static void main(String [] args)
    {
        ArrayList<String> Names= new ArrayList<String>();
        Names.add("Nita");
        Names.add("gita");
        Names.add("Piya");
        
        System.out.println(Names);
        
        System.out.println("Elements of array are :");
        for(int i=0; i<Names.size(); i++)
        {
            System.out.println(Names.get(i));
            
        }
        
        Collections.sort(Names);
        System.out.println("Elements of array after sorting :");
        for(int i=0; i<Names.size(); i++)
        {
            System.out.println(Names.get(i));
            
        }
        
        Names.set(1, "sita");
        
        Collections.sort(Names);
        System.out.println("Elements of array after changing and sorting :");
        for(int i=0; i<Names.size(); i++)
        {
            System.out.println(Names.get(i));
            
        }
        
    }
}