// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Aramstrong
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number:");
        int n=sc.nextInt();
        int temp=n;
        int sum=0,digit=0;
        while(n>0)
        {
            n=n/10;
            digit++;
        }
        System.out.println("digits:"+digit);
        n=temp;
        while(n>0)
        {
            int res=n%10;
            sum+=Math.pow(res,digit);
            n=n/10;
        }
        System.out.println("sum value is"+sum);
        if(sum==temp)
        {
           System.out.println("amstrong");
        }
        else
        {
         System.out.println(" not amstrong");
        }
    }
}
