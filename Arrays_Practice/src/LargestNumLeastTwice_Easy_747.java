/* My solution beats 100%,O(N) time and O(1) space. */


public class LargestNumLeastTwice_Easy_747 {
    public static void main(String[] args) {
        int A[] = {3,6,1,0};
        System.out.println(new LargestNumLeastTwice_Easy_747().dominantIndex(A));
    }

    public int dominantIndex(int[] nums) {

        int max = nums[0];
        int index = 0;
        boolean flag = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                    max = nums[i];
                    index = i;
                }
        }

        for (int i = 0; i < nums.length; i++) {
            if (index == i)
                continue;

            if (!(max >= 2 * nums[i]))
                flag = false;
        }

        if (flag) return index;
        else return -1;
    }
}
