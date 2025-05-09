// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Main
{
    static int count=0;
    static void f1()
    {
        if(count==3)
          return ;
        System.out.println(count);
        count++;
        f1();
    }
    
    public static void main(String args[])
    {
        f1();
    }
}
