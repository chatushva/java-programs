// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static int mis(int arr[],int N)
    {
          int N = arr.length + 1;
        int xor = 0;

        // XOR numbers from 1 to N
        for (int i = 1; i <= N; i++) {
            xor ^= i;
        }

        // XOR array elements
        for (int num : arr) {
            xor ^= num;
        }

        return xor; // missing number
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int N=sc.nextInt();
        System.out.println("enter the ele into array");
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(mis(arr,N));
    }
}
