import java.util.*;
class Main {
    public static int sors(int arr[])
    {
        int n=arr.length;
        int c=0;
        int ele=0;
        for(int i=0;i<n;i++)
        {
            if(c==0)
            {
                c=1;
                ele=arr[i];
            }
            else if(arr[i]==ele)
            {
                c++;
            }
            else
            {
                c--;
            }
        }
        int c2=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==ele)
            {
                c2++;
            }
        }
        if(c2 >n/2)
        {
            return ele;
        }
        
        return -1;
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
       System.out.println("max is "+sors(arr));
    }
}
