import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearedNumber_Easy_448 {
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};
        List<Integer> list = new DisappearedNumber_Easy_448().findDisappearedNumbers(arr);
        System.out.println(list);
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int result[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[nums[i]-1] = 1;
        }
        for (int i = 0; i < result.length; i++) {
            if (result[i] == 0)
                list.add(i+1);
        }

        return list;
    }
}
