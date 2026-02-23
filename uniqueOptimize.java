
import java.util.*;
class Main {
    public static int uni(int arr[])
    {
        int xor=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            xor=xor^arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the size of the array:");
       int n=sc.nextInt();
       System.out.println("enter the elements into the array:");
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();
       }
       System.out.println("unique ele in an array " +uni(arr));
    }
}
