
import java.util.*;
class Main {
    public static int lo(int arr[],int k)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int maxLen=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
            if(sum==k)
            {
                maxLen=i+1;
            }
            if(map.containsKey(sum-k))
            {
                maxLen=Math.max(maxLen,i-map.get(sum-k));
            }
            if (!map.containsKey(sum))
            {
             map.put(sum, i);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        System.out.println("enter the el in array:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter target (k):");
        int k=sc.nextInt();
        System.out.println("longest len is : "+lo(arr,k));
      
       
    }//[10, 5, 2, 7, 1, 9] len is 4
}
