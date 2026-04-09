import java.util.Arrays;

class Solution {
    public int findNonMinOrMax(int[] nums) {
        if (nums.length <= 2) {
            return -1;
        }

        Arrays.sort(nums);   // sort array
        return nums[1];      // return element which is not min or max
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {3, 2, 1, 4};

        int result = sol.findNonMinOrMax(nums);

        System.out.println("Result: " + result);
    }
}
