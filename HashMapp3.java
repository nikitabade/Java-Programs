//Accept string from user and display all words (If it is more than one times then it will prints only once)
import java.util.*;
class Marvellous
{
    public void WordFrequency(String s)
    {
        String s2=s.trim().replaceAll("[ ]{2,}"," ");
        String Arr[]=s2.split(" ");
       
        HashMap <String, Integer> hobj= new HashMap <String, Integer>();
        
        int i=0;
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
        Set <String> sobj= hobj.keySet();
        
        System.out.println("Unique word from string :"+sobj);
    }
}

class HashMapp3
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