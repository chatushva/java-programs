// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static int fun(int n){
        if(n==0)
        return 1 ;
        else
        return n*fun(n-1);
    }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();
       int res = fun(n);
       System.out.println(res);
     
    }
}
