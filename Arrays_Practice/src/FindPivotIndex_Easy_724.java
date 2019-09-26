public class FindPivotIndex_Easy_724 {
    public static void main(String[] args) {
        int arr[] = {1,7,3,6,5,6};
        System.out.println(new FindPivotIndex_Easy_724().pivotIndex(arr));
    }

    public int pivotIndex(int[] nums) {
        int left = 0, right = 0, index = -1;

        for (int i = 0; i < nums.length; i++) {
            right += nums[i];
        }

        if (index == right)
            return 0;
        else
            right = 0;

        for (int i = 0; i < nums.length; i++) {
            left += nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if (j == i+1)
                    continue;
                right += nums[j];
            }
            System.out.println(left + " " + right);
            if (left == right){
                index = i+1;
                break;
            }
            right = 0;
        }

        for (int i = 0; i < nums.length; i++) {
            right += nums[i];
        }

        if (index == right)
            return 0;

        return index;
    }
}
