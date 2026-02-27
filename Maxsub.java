//brute
import java.util.*;
class Main {
    public static int sub(int arr[])
    {
        int n=arr.length;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum=sum+arr[k];
                }
                maxi=Math.max(sum,maxi);
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the size of the array");
       int n=sc.nextInt();
       System.out.println("enter ele into the array");
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();
       }
       System.out.println("max sub array"+sub(arr));
    }
}
