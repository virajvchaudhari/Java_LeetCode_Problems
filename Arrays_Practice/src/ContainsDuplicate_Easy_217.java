import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate_Easy_217 {
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 1};
        System.out.println(new ContainsDuplicate_Easy_217().containsDuplicate(A));
    }


/*
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> values = new HashSet<>();
        for (int val:
             nums) {
            values.add(val);
        }


        if (nums.length == values.size()){
            return false;
        }

        return true;
    }
*/


    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer,Integer> values = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (values.containsKey(nums[i]))
                return true;
            else
                values.put(nums[i],1);
        }
        return false;
    }
}

//
//if (arr[i] == 0){
//        arr[i+1] = arr[i];
//        arr[i] = 0;
////                n = n -1;
//        }
//        }