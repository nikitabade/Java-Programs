
class BubbleSortFun
{
    public void BSearch(int[] arr)
    {
        int n=arr.length;
        int temp=0;
        
        for (int i=0; i<n; i++)
        {
            for(int j=1; j<(n-i); j++)
            {
                if(arr[j-1]>arr[j])
                {
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]= temp;
                }
            }
        }
    }
}

public class BubbleSort
{
    public static void main(String args[])
    {
        int arr[]={10,60,80,102,40,120,950,620};
        
        BubbleSortFun bobj= new BubbleSortFun();
        
        System.out.println("Array before sorting");
        for(int i=0; i < arr.length; i++)
        {  
            System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
        
        bobj.BSearch(arr);
        
        
        System.out.println("Sorted array is");
        
        for(int k=0; k<arr.length; k++)
        {
            System.out.print(arr[k]+" ");
        }
        
        
    }
}
