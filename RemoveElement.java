import java.util.*;

class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int j = 0;  // pointer to place valid elements

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

      
        System.out.print("Enter value to remove: ");
        int val = sc.nextInt();

        Solution obj = new Solution();
        int newLength = obj.removeElement(nums, val);

        System.out.println("New length after removal: " + newLength);
        System.out.println("Array after removal:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
