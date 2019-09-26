import java.util.Arrays;

public class ArrayPartition_Easy {
    public int arrayPairSum(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 2) {
//            System.out.println(i + " " + nums[i] + " " + nums[i + 1]);
/*            Here min was not necessary as we have already sorted the elements and we
            are incrementing by 2, so instead we can just take num[i] that will suffice.
*/
//            result += Math.min(nums[i], nums[i + 1]);
            result += nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int A[] = {1, 4, 3, 2};
        ArrayPartition_Easy ap = new ArrayPartition_Easy();
        int result = ap.arrayPairSum(A);
        System.out.println(result);
    }
}
