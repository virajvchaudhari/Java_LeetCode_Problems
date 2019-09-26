public class DivideAndConquer_Easy_53 {
    public static void main(String[] args) {
        int A[] = {-2,1,-3,4,-1,2,1,-5,4};
      new DivideAndConquer_Easy_53().maxSubArray(A);
//        System.out.println(new DivideAndConquer_Easy_53().maxSubArray(A));
    }

    public int maxSubArray(int[] nums) {
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i, x = 0; j < nums.length &&  x< nums.length; j++,x++) {
                System.out.println(j);

            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
        }


/*
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int k = 0, j = k; j < nums.length && k <= i; j++, k++) {
                sum += nums[j];
            }

            if (sum > max)
                max = sum;
        }
*/
        return max;
    }
}
