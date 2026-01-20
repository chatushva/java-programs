
import java.util.*;
class GCD
{
    public int gcd(int n1,int n2)
    {
         for(int i=Math.min(n1,n2);i>=1;i--)
         {
             if(n1%i==0&&n2%i==0)
             {
                 int gcd=i;
                 System.out.println(gcd);
                 break;
             }
         }
         return 0;
         
    }
    public static void main(String args[])
    {
        GCD g=new GCD();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n1:");
        int n1=sc.nextInt();
        System.out.println("enter the n2:");
        int n2=sc.nextInt();
       int result= g.gcd(n1,n2);
       System.out.println(result);
    }
}
