// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static int sub(int arr[])
    {
        int n=arr.length;
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum>maxi)
            {
               maxi=sum; 
            }
            if(sum<0)
            {
                sum=0;
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
