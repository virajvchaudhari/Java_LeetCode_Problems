public class ProductExceptSelf_Medium_238 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int result[] = new ProductExceptSelf_Medium_238().productExceptSelf(nums);
        for (int val: result) {
            System.out.print(val + " ");
        }
    }

    /**
     *  An excellent solution by one of the posts.
     */

    public int[] productExceptSelf(int[] nums){
//      Store the array length
        int n = nums.length;

//      Make the result array of input array length.
        int res[] = new int[n];

//      Initialize first element of the result array to 1.
        res[0] = 1;

//      Start looping form the second index for the result array.

        for (int i = 1; i < n; i++) {
            System.out.println("res " + i + " before = "  + res[i]);
            res[i] = res[i - 1] * nums[i - 1];
            System.out.println("res " + i + " after = "  + res[i]);
        }
        for (int val:
             res) {
            System.out.print(val + " ");
        }
        int right = 1;

        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return nums;
    }


    /**
     * My solution didn't work while handling zeros thing. Worked otherwise.
     */
    /*public int[] productExceptSelf(int[] nums) {
        boolean enter = false, flag = false;
        int total,count = 0;

        if (nums.length == 0)
            return new int[1];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                enter = true;
            else
                count++;
        }

        if (enter){
            if (count == nums.length - 1 && nums.length != 2)
                total = 0;
            else
                total = 1;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0)
                    flag = true;
                else
                    total *= nums[i];
            }

            for (int i = 0; i < nums.length; i++) {
                if (flag && nums[i] != 0)
                    nums[i] = 0;
                else if (!flag && nums[i] != 0)
                    nums[i] = total/nums[i];
                else
                    nums[i] = total;
            }
        }

        return nums;
    }*/
}
