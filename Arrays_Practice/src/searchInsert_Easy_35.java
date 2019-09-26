// My solution beats 100%.

public class searchInsert_Easy_35 {
    public static void main(String[] args) {
        int A[] = {1, 3, 5, 6};
        System.out.println(new searchInsert_Easy_35().searchInsert(A, 5));
    }

    public int searchInsert(int[] nums, int target) {

        int mid = nums[nums.length / 2];

        if (target == mid)
            return nums.length / 2;

        else if (target > mid) {
            for (int i = (nums.length / 2) + 1; i < nums.length; i++) {
                if (target <= nums[i])
                    return i;
            }
            return nums.length;
        } else {
            for (int i = 0; i < nums.length / 2; i++) {
                if (target <= nums[i])
                    return i;
            }
            return nums.length/2;
        }
    }
}