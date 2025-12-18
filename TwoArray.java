import java.util.*;

class TwoArray {
    boolean twoSum(int arr[], int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            int need = target - num;
            if (set.contains(need)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        Solution sol = new Solution();
        System.out.println(sol.twoSum(arr, target));
    }
}
