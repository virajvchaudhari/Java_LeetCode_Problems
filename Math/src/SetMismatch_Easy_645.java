public class SetMismatch_Easy_645 {
    public static void main(String[] args) {
        int A[] = {1,2,2,3,3,7};
        new SetMismatch_Easy_645().findErrorNums(A);
    }

    public int[] findErrorNums(int[] nums) {
        int dup = 0;
//        Finding the duplicate.

        for (int i = 0; i < nums.length; i++) {
            dup = dup ^ nums[i];
            if (dup == 0)
                System.out.println(nums[i]);
        }
//        System.out.println(dup);
        return new int[2];
    }
}
