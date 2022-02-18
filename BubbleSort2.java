import java.util.*;

class Sorting
{
    public  void BubbleSort(int Arr[])
    {
        int i=0, j=0, temp=0;
        int size= Arr.length;
        
        for(i=0; i< size; i++)
        {
            for(j=0; j<size-i-1; j++)
            {
                if(Arr[j] > Arr[j+1])
                {
                    temp= Arr[j];
                    Arr[j] = Arr[j+1];
                    Arr[j+1] = temp;
                }
            }
        }
    }
    
    public boolean CheckSort(int Arr[])
    {
        int i=0, j=0;
        int size= Arr.length;
        
        if(Arr[0] > Arr[(size -1)])
        {
            for(i=0; i< size-1; i++)
            {
                if(Arr[i] <Arr[i+1])
                {
                    break;
                }
            }
            if(i < (size-1))
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        else
        {
            for(i=0; i< size-1; i++)
            {
                if(Arr[i] > Arr[i+1])
                {
                    break;
                }
            }
            if(i < (size-1))
            {
                return false;
            }
            else
            {
                return true;
            }
        }
    }
    
}


class BubbleSort2
{
    public static void main(String[] arg)
    {
        Scanner sobj= new Scanner(System.in);
        
        System.out.println("Enter the size of array");
        int size= sobj.nextInt();
        
        int Arr[]= new int[size];
        
         System.out.println("Enter the Elements");
         for(int i=0; i< Arr.length; i++)
         {
             Arr[i]=sobj.nextInt();
         }
      
         Sorting obj= new Sorting();
         
        
        boolean bRet=obj.CheckSort(Arr);
         
        if(bRet== true)
        {
            System.out.println("Data is sortd");
        }
        else
        {
            System.out.println("Data is not sortd");
            
            obj.BubbleSort(Arr);
            
            System.out.println("Data after Sorting");
            for(int i=0; i< Arr.length; i++)
            {
                System.out.println(Arr[i]);
            }
            
        }
        
    }
}