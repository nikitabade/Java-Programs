//Accept string display such word which are multiple times
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
        int iMax=0;
        String output= null;
        
        
        for(String word : sobj)
        {
            if(hobj.get(word)>iMax)
            {
                output= word;
                iMax= hobj.get(word);
            }
        }
        System.out.println(output+" Word occur max number times is: "+iMax);
    }
}

class HashMapp4
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