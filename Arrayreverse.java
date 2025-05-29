// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        System.out.println("enter elements into the array:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        { 
             arr[i]=sc.nextInt();
        }
        System.out.println("array is:"+Arrays.toString(arr));
        for(int i=0;i<n/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        System.out.println("reversed array is:");
        for(int i=0;i<1;i++)
        {
           System.out.println("array is:"+Arrays.toString(arr)); 
        }
       
        }
    }
