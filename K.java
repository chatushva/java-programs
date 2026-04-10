import java.util.Arrays;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);  // Sort in ascending order
        int n = nums.length;

        // Reverse the array to make it descending
        for (int i = 0; i < n / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[n - i - 1];
            nums[n - i - 1] = temp;
        }

        return nums[k - 1]; // kth largest element
    }
}

public class Main {
    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        int result = obj.findKthLargest(nums, k);
        System.out.println("Kth Largest Element: " + result);
    }
}
