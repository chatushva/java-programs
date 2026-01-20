import java.util.*;
class BubbleSort {
    
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of array :");
      int n=sc.nextInt();
      int []a=new int[n];
      System.out.println("enter the elements into the array :");
      for(int i=0;i<a.length;i++)
      {
          a[i]=sc.nextInt();
      }
     for(int i=0;i<n;i++)
     {
         for(int j=0;j<n-1;j++)
         {
             if(a[j]>a[j+1])
             {
                 int temp=a[j];
                 a[j]=a[j+1];
                 a[j+1]=temp;
             }
         }
     }
      System.out.println("sorted arder");
     for(int i=0;i<n;i++)
     {
         System.out.print(a[i]+" ");
     }
    }
}
