// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number:");
        int n=sc.nextInt();
        int result=0;
        int temp=n;
        while(n>0)
        {
            int res=n%10;
             result=result*10+res;
            n=n/10;
        }

        if(result==temp)
        {
           System.out.println("palindrome");
        }
        else
        {
         System.out.println(" not palindrome");
        }
    }
}
