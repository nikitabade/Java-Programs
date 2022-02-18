
class BinarySearchFun
{
    public void BSearch(int[] arr,int first, int last, int key)
    {
        int mid=(first+last)/2;
        
        while(first<=last)
        {
            if(arr[mid]<key)
            {
                first=mid+1;
            }
            else if(arr[mid]==key)
            {
                
                System.out.println("Value is at position: "+ ++mid);
                break;
            }
            else
            {
                last=mid-1;
            }
            mid= (first+last)/2;
        }
        
        if(first>last)
        {
            System.out.println("No such element in the array");
        }
    }
}

public class BinarySearch1
{
    public static void main(String args[])
    {
        int arr[]={10,60,80,102,40,120,950,620};
        int value=950;
        int last=arr.length-1;
        
        BinarySearchFun bobj= new BinarySearchFun();
        
        bobj.BSearch(arr,0,last,value);
        
        
    }
}
