 import java.util.*;
public class Main
{
    
    public static void main (String args[])
    {
        System.out.println("enter any number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int N=0;
        while(n>0)
        {
            int res=n%10;
            N=(N*10)+res;
            n=n/10;
        }
        if(temp==N)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }
        
    }
}
