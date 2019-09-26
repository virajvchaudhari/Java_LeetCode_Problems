import java.util.HashSet;
import java.util.Set;

public class SingleNumber_Easy_136 {
    public static void main(String[] args) {
        int A[] = {2,2,1};
        new SingleNumber_Easy_136().singleNumber(A);
    }

    public int singleNumber(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length; i++){
            result ^= nums[i];
        }
        return result;
    }

}
