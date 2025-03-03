{
    public static void main(String args[])
    {
        int digits=0,sum=0;
        System.out.println("enter any number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        while(n>0)
        {
            n=n/10;
            digits++;
            System.out.println(digits);
        }
        System.out.println("no of digit is  "+digits);
        n=temp;
        while(n>0)
        {
            int value=n%10;
            sum += Math.pow(value,digits);
            n/=10;
        }
         System.out.println(sum);
         if(sum==temp)
         {
             System.out.println("given number is armstrong");
         }
         else
         {
             System.out.println("not an armstrong");
         }
    }
}
