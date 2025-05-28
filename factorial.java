// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void fun(int i,int fact){
        if(i<1)
        {
        System.out.println(fact);
        return;
        }
        else
        {
        fun(i-1,fact*i);
        }
    }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();
       fun(n,1);
      
    }
}
