// Online Java Compiler
// Use  System.out.println("enter any number:");
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter any number:");
        int n=sc.nextInt();
        int a=0,b=1;
         System.out.println(a);
        System.out.println(b);
        for(int i=2;i<=n;i++)
        {
            int c=a+b;
            a=b;
            b=c;  
            System.out.println(c);

        }
       
    }
}
