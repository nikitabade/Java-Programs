import java.util.*;
class Marvellous
{
    public void CharFrequency(String s)
    {
        String s2= s.replaceAll(" ","");
        System.out.println("String after removing white spaces is : "+s2);
       
        char Arr[]= s2.toCharArray();
        HashMap<Character, Integer>hobj= new HashMap<Character, Integer>();
        
        int i=1;
        for(char ch : Arr)
        {
            if(hobj.containsKey(ch))
            {
                i=hobj.get(ch);
                hobj.put(ch,i+1);
            }
            else
            {
                hobj.put(ch,i);
            }
        }
        System.out.println("Frequency of each character is : "+hobj);
        
    }
}

class HashMapp
{
    public static void main (String[] args)
    {
       
        Scanner sobj= new Scanner(System.in);
        System.out.println("Enter string");
        String s= sobj.nextLine();
        
        Marvellous mobj= new Marvellous();
        mobj.CharFrequency(s);
        
        
        
    }    
}