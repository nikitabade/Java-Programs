//variadic function : variable number of arguments

import java.util.*;
class Marvellous
{
    public int Addition(int ...a)
    {
        int iSum=0;
        for(int no : a)
        {
            iSum=iSum+no;
        }
        return iSum;
    }
}

class Vardiac2
{
    public static void main (String[] args)
    {
       Marvellous mobj= new Marvellous();
       int iRet=mobj.Addition(11, 21, 51);
       System.out.println("Addition is :"+iRet);
        
    }    
}