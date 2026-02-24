
import java.util.*;
class Main {
    public static int[] lo(int arr[],int k)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(arr[i]+arr[j]==k)
                {
                    return new int[]{i,j};
                }
            }
            
        }
         return new int[]{0,0};
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
        System.out.println("longest len is : "+Arrays.toString(lo(arr,k)));
      
       
    }
}
