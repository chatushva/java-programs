// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Divsors
{ 
    public static  int factors(int n)
    {
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(i*j==n)
                {
                
                  System.out.println("factors of "+n+" is "+j);
                }
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
