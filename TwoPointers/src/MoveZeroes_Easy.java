import java.util.Arrays;

public class MoveZeroes_Easy {
    public static void main(String[] args) {
        int A[] = {0, 1, 3, 0, 2};
        new MoveZeroes_Easy().moveZeroes(A);
    }

/* My solution still failing some cases and is not efficient too: nlogn

    public void moveZeroes(int[] nums) {
        Arrays.sort(nums);
        int end = nums.length - 1;
        int start = 0;
        int count = 0;

        if (!(nums.length == 0 || nums.length == 1)) {

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0)
                    count++;
            }

            if (nums.length == 2 && count!= nums.length){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
            }

            if (count != nums.length) {

                while (nums[start] == 0 && start!= nums.length - 1) {
                    int temp = nums[start];
                    nums[start] = nums[end];
                    nums[end] = temp;
                    end--;
                    start++;
                }

                int j = 0;
                while (j <= start) {
                    int temp = nums[start];
                    nums[start] = nums[j];
                    nums[j] = temp;
                    j++;
                    start--;
                }
            }
        }

        for (int el : nums)
            System.out.println(el);
*/

    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int insertPos = 0;
        for (int num : nums) {
            if (num != 0)
                nums[insertPos++] = num;
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }

//        for (int i : nums) System.out.println(i);
    }

}

