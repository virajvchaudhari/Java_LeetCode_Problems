import java.util.Arrays;
import java.util.HashMap;

public class RelativeRanks_Easy_506 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        String res[] = new RelativeRanks_Easy_506().findRelativeRanks(arr);
        for (String val : res) {
            System.out.print(val + " ");
        }
    }

    public String[] findRelativeRanks(int[] nums) {
        String result[] = new String[nums.length];
        int[] copy = Arrays.copyOf(nums, nums.length);

        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], nums.length - i);
        }
        System.out.println(map);
        for (int i = 0; i < copy.length; i++) {
            if (map.get(copy[i]).equals(1))
                result[i] = "Gold Medal";
            else if (map.get(copy[i]).equals(2))
                result[i] = "Silver Medal";
            else if (map.get(copy[i]).equals(3))
                result[i] = "Bronze Medal";
            else
                result[i] = Integer.toString(map.get(copy[i]));
        }
        return result;
    }
}