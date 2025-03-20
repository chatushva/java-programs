public class Solution {
    public static void nStarTriangle(int n) {
        // Write your code here
        int gap=n-1;
        int stars=1;
        for(int i=1;i<=n;i++)
        {
        for(int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for(int k=1;k<=(2*i-1);k++)
        {
            System.out.print("*");
        }
        System.out.println();
        }
    }
}
