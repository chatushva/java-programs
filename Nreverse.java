
import java.util.*;
class Main {
    static void f1(int i,int n)
    {
        if(i==n)
         return ;
        System.out.println(i);
        f1(i+1,n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();
        f1(1,n);
    }
}

