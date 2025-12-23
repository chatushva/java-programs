import java.util.*;
class MergeSort
{
    public static void MergeSort(int arr[],int low,int high)
    {
        if(low>=high) return;
        else
        {
        int mid=(low+high)/2;
        MergeSort(arr,low,mid);
        MergeSort(arr,mid+1,high);
        Merge(arr,low,mid,high);
        }
    }
    public static void Merge(int arr[],int low,int mid,int high)
    {
        
       
        int left=low;
        int right=mid+1;
        int k=0;
        int temp[]=new int[high - low + 1];
        while(left<=mid && right<=high)
        {
            if(arr[left]<=arr[right])
            {
             temp[k]=arr[left];
             left++;
             k++;
            }
             else
             {
             temp[k]=arr[right];
             right++;
             k++;
             }
        }
        while(left<=mid)
        {
            temp[k]=arr[left];
            left++;
            k++;
        }
         while(right<=high)
        {
            temp[k]=arr[right];
            right++;
            k++;
        }
        for(int i=low;i<=high;i++)
        {
            arr[i]=temp[i-low];
        }
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        System.out.println("enter elements into array :");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
             arr[i]=sc.nextInt();
        }
        int low=0;
        int high=n-1;
        MergeSort(arr, low, high);
        for(int i = 0; i < n; i++)
       {
         System.out.print(arr[i] + " ");
       }
    }
}
