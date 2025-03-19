class Solution {

    void printTriangle(int n) {
        // code here
        for(char i=1;i<=n;i++)
        {
            for(char j='A';j<'A'+i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
