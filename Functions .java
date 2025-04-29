import java.util.*;
class Functions
{
    static int count=0;
    public static void fun()
    {
        
        if(count==4)
        return;
        System.out.print(count);
        count=count+1;
        funs();
        
    }
     public static void funs()
    {
       
        if(count==8)
        return;
        System.out.print(count);
        count++;
    }
    
    public static void main(String args[])
    {
         fun();
    }
}
