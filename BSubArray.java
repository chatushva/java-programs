
import java.util.*;
class Main {
    public static int sum(int arr[],int k)
    {
        
        int maxLength=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
               sum=sum+arr[j];
              if(sum==k)
              {
                maxLength = Math.max(maxLength, j - i+ 1);
               }
              
            }
          
        }
         return maxLength;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        System.out.println("enter the ele into the array");
        int arr[]=new int[n];
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("enter the value of k");
        int k=sc.nextInt();
        System.out.println("leng is"+sum(arr,k));
      
    }
}
// }10, 5, 2, 7, 1, 9
len is 4
