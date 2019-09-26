/**
 *  My solution beats 100 % Runtime & Memory Usage.
 */

import java.util.Arrays;

public class RemoveElement_Easy_27 {
    public static void main(String[] args) {
        int A[] = {0,1,2,2,3,0,4,2};
        System.out.println(new RemoveElement_Easy_27().removeElement(A,2));
    }

    public int removeElement(int[] nums, int val) {
        if (nums.length == 0){
            return 0;
        }

        int max = nums[0];

        for (int i = 0; i < nums.length ; i++) {
            max = Math.max(max, nums[i]);
        }

        max = max + 1;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val){
                nums[i] = max;
                count++;
            }
        }

        Arrays.sort(nums);

        int j = 0;
        while(j < nums.length && nums[j] < max){
            System.out.println(nums[j++]);
        }

        return nums.length - count;
    }
}
