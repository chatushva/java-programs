import java.util.*;

class  Main{
    public static int con(int arr[])
{
    int count=0,max=0;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==1)
        {
            count++;
        }
        else
        {
            count=0;
        }
        max=Math.max(count,max);
    }
    return max;
    
}
    
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
       System.out.println(con(arr));
     
  }
}
