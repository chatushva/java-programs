
import java.util.*;
class LeftArray {
    
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of array :");
      int n=sc.nextInt();
      int []arr=new int[n];
      System.out.println("enter the elements into the array :");
      for(int i=0;i<arr.length;i++)
      {
          arr[i]=sc.nextInt();
      }
     int []temp=new int[n];
      for(int i=1;i<n;i++)
      {
        temp[i-1]=arr[i];
      }
      temp[arr.length-1]=arr[0];
      System.out.println("left rotation by one:");
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
