
import java.util.*;
class Main {
    public static int uni(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int flag=0;
            for(int j=0;j<n;j++)
            {
              if(arr[j]==arr[i])
              {
                 flag++;
              }
            }
            if(flag==1)
            {
                return arr[i];
            }
        }
        return -1;
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
