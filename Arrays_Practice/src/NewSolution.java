import java.util.Arrays;
import java.util.Collections;

public class NewSolution {
    public static void main(String[] args) {
        int nums[] = {1};
        System.out.println(new NewSolution().searchInsert(nums,2));
    }

    public int searchInsert(int[] nums, int target) {
        int result, val = 0;
        for (int i = 0; i < nums.length; i++) {
            result = nums[i] ^ target;
            System.out.print(nums[i] + " " + result);
            if ((result == 0 || result == 1) && target < nums[i]){
                 val = i;
            }
            if ((result == 0 || result == 1) && target > nums[i])
                val = i + 1;
        }
        if (target < nums[val])
            return val;
        return 0;
    }

    /*public int removeElement(int[] nums, int val) {

        int max = 0;
        for (int num : nums) {
            max = Math.max(num,max);
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
           int result = nums[i] ^ val;
           if (result == 0){
               count++;
               nums[i] = max + 1;
           }
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - count; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        return nums.length - count;
    }*/
}
