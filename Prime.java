
import java.util.*;
class Divsors
{ 
    public static  int factors(int n)
    {
        for(int i=2;i<n;i++)
        {
           if(n%i==0 )
           {
               System.out.println(" not prime");
               break;
           }
           else
           {
           System.out.println(" prime");
           break;
           }
        }
        return 0;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number:");
        int n=sc.nextInt();
        factors(n);
        
    }
}
