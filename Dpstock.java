import java.util.*;

class Main {

    public static int sub(int arr[]) {
      int mini=arr[0],profit=0;
      int n=arr.length;
      for(int i=1;i<n;i++)
      {
          int cost=arr[i]-mini;
          profit=Math.max(cost,profit);
          mini=Math.min(arr[i],mini);
      }
      return profit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        System.out.println("Enter elements into the array:");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("profit is: " + sub(arr));
    }
}
