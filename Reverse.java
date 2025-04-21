// reverse a number
import java.util.*;
class Reverse
{
    public static int reverse(int n)
    {
       int result=0;
       while(n>0)
       {
       int rev=n%10;
       result=result*10+rev;
       n=n/10;
       }
       return result;
    }
    public static void main(String args[])
    {
       
         Scanner sc=new Scanner(System.in);
         System.out.println("enter any numeber:");
         int n=sc.nextInt();
         int value=reverse(n);
         System.out.println("reversed number is:"+value);
    }
}
