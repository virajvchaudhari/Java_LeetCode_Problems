public class RemoveDuplicatesFromSorted_Easy_26 {
    public static void main(String[] args) {
        int A[] = {1,1,2,2,3,3,3,3,4,4};
        System.out.println(new RemoveDuplicatesFromSorted_Easy_26().removeDuplicates(A));
    }

//    public int removeDuplicates(int[] nums) {
//        int duplicates = 0;
//        int n = nums.length;
//        for (int i = 0; i < n - 1; i++) {
//            if (nums[i+1] == nums[i]){
//                duplicates++;
////                System.out.println(duplicates);
//                int delete = nums[i+1];
//                for (int j = delete; j < n - 1; j++) {
//                    nums[j] = nums[j+1];
//                }
//                n = n - duplicates+1;
//
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            System.out.print(nums[i] + " ");
//        }
//
//        return n - 1;
//    }

    public int removeDuplicates(int[] arr){
        int j = 0;

        if (arr.length == 0) return  0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i+1]){
                arr[j] =  arr[i];
                j++;
            }
        }
        arr[j] = arr[arr.length  - 1];

        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }

        return j+1;
    }

}
