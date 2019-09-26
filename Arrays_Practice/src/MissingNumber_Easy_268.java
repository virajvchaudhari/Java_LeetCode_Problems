import java.util.Arrays;

public class MissingNumber_Easy_268 {
    public static void main(String[] args) {
        int A[] = {0,2};
        System.out.println(new MissingNumber_Easy_268().missingNumber(A));
    }

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if ((nums.length == 1 || nums.length == 2) && nums[0] == 0) {
            return nums[Math.max(0, nums.length -1)] + 1;
        } else if ((nums.length == 1 || nums.length == 2) && nums[0] > 0) {
            return nums[0] - 1;
        } else {
            for (int i = 0; i < nums.length - 1; i++) {
                if ((nums[i + 1]) - nums[i] == 2)
                    return (nums[i] + 1);
            }
        }
        return nums[nums.length - 1] + 1;
    }
}


/**
 * The basic idea is to use XOR operation. We all know that a^b^b =a,
 * which means two xor operations with the same number will eliminate the number
 * and reveal the original number.
 * In this solution, I apply XOR operation to both the index and
 * value of the array. In a complete array with no missing numbers,
 * the index and value should be perfectly corresponding( nums[index] = index),
 * so in a missing array, what left finally is the missing number.
 */

/*public int missingNumber(int[] nums) {

    int res = nums.length;
    for(int i=0; i<nums.length; i++){
        res = res ^ i ^ nums[i]; // a^b^b = a
    }
    return res;
}*/


// Another good solution



/**
 since the n numbers are from [0, n], we can just add all the numbers from [0, n] together
 and minus the sum of the n-1 numbers in array.
 */

/*
public static int missingNumber(int[] nums) {
    int sum = nums.length;
    for (int i = 0; i < nums.length; i++)
        sum += i - nums[i];
    return sum;
}
 */