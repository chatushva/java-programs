// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main
{
    public  static void fun(int i, int n)
    {
        if(i<1)
         return;
        System.out.println(i);
        fun(i-1,n);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();
        fun(n,n);
    }
}
