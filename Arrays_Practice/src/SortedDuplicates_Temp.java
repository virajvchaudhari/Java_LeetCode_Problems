public class SortedDuplicates_Temp {
    public static void main(String[] args) {
        int[] A = {1, 1, 2, 2, 3, 4, 4, 4, 5, 5, 6, 6, 7, 8, 9};
        System.out.println(new SortedDuplicates_Temp().removeDuplicates(A));
    }

//    public int removeDuplicates(int[] arr){
//        int temp[] = new int[arr.length];
//        int j = 0;
//        for (int i = 0; i < arr.length - 1; i++) {
//                if(arr[i] != arr[i+1]) {
//                    temp[j] =  arr[i];
//                    j++;
//                }
//        }
//        temp[j] = arr[arr.length - 1];
//
//        for (int i = 0; i < temp.length; i++) {
//            System.out.print(temp[i] + " ");
//        }
//
//        int count = 0;
//        for (int i = 0; i < temp.length; i++) {
//            if (temp[i] != 0)
//                count++;
//        }
//
//        return count;
//    }


    /**
     * Fastest Solution here.
     */

    public int removeDuplicates(int[] nums) {
        int i = nums.length > 0 ? 1 : 0;
        for(int n  : nums)
            if (n > nums[i - 1])
                nums[i++] = n;
        return i;
    }
}