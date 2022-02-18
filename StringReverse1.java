//Accept string from user and reverse the string (using:  String.valueOf(Arr))
import java.util.*;

class StringX
{
    public String str;
    
    public void Accept()
    {
        Scanner sobj= new Scanner(System.in);
        System.out.println("Enter string");
        str= sobj.nextLine();
    }
    
    public void Display()
    {
        System.out.println("String is:"+str);
    }
}
 class Marvellous extends StringX
{
    public String ReverseX()
    {
       char Arr[]= str.toCharArray();
       int iStart=0, iEnd= Arr.length-1;
       char temp;
       while(iStart< iEnd)
       {
           temp= Arr[iStart];
           Arr[iStart]= Arr[iEnd];
           Arr[iEnd]=temp;
           iStart++;
           iEnd--;
       }
        return String.valueOf(Arr);
    }
}

 class StringReverse1
{
    public static void main (String[] args)
    {
        Marvellous mobj= new Marvellous();
       
        mobj.Accept();
        mobj.Display();
      
      String S= mobj.ReverseX();
      System.out.println("Reverse string is:"+S);
    }
}