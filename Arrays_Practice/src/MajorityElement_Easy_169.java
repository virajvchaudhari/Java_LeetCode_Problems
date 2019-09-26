import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement_Easy_169 {
    public static void main(String[] args) {
        int A[] = {2,2,1,1,1,2,2};
        int result = new MajorityElement_Easy_169().majorityElement(A);
        System.out.println(result);
    }

/*
    public int majorityElement(int[] nums) {
        int length = (int) Math.floor(nums.length/2);
        HashMap<Integer,Integer> majorCount = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            if (majorCount.containsKey(nums[i])){
                majorCount.put(nums[i],majorCount.get(nums[i])+1);
            }
            else
                majorCount.put(nums[i],1);

            if (majorCount.get(nums[i]) > length)
                return nums[i];
        }
        return 0;
    }
*/

    public int majorityElement(int[] nums) {
        if (nums.length == 1) return nums[0];
        int length = (int) Math.floor(nums.length/2);
        Arrays.sort(nums);
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]){
                count++;
                if (count > length){
                    return nums[i];
                }
            }
            else
                count = 1;
        }
        return 0;
    }
}


/* Another good solution in terms of
time : O(n)
space : O(1) complexity.

public int majorityElement(int[] num) {

        int major = num[0], count = 1;

        for(int i = 1; i < num.length; i++)
        {
            if(count == 0){
                count++;
                major = num[i];
            }
            else if( major == num[i]){
                count++;
            }
            else
                count--;

        }
        return major;
}

 */