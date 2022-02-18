//Accept string from user and display frequency of each world
import java.util.*;
class Marvellous
{
    public void WordFrequency(String s)
    {
        String s2=s.trim().replaceAll("[ ]{2,}"," ");
        String Arr[]=s2.split(" ");
       
        HashMap <String, Integer> hobj= new HashMap <String, Integer>();
        
        int i=1;
        for(String str : Arr)
        {
            if(hobj.containsKey(str))
            {
                //i=hobj.get(str);
                hobj.put(str,(hobj.get(str))+1);
            }
            else
            {
                hobj.put(str,i);
            }
        }
        System.out.println("Frequency of each word is : ");
        System.out.println(hobj);
        
    }
}

class HashMapp1
{
    public static void main (String[] args)
    {
       
        Scanner sobj= new Scanner(System.in);
        System.out.println("Enter string");
        String s= sobj.nextLine();
        
        Marvellous mobj= new Marvellous();
        mobj.WordFrequency(s);
        
    }    
}