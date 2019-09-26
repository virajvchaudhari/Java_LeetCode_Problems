public class MaxConsecutiveOnes_Easy_485 {
    public static void main(String[] args) {
        int nums[] = {1,1,0,1,1,1};
        System.out.println(new MaxConsecutiveOnes_Easy_485().findMaxConsecutiveOnes(nums));
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;
        for (int val: nums) {
            if (val == 1)
                count++;
            else{
                max = Math.max(count,max);
                count = 0;
            }
        }
        return Math.max(count,max);
    }
}


