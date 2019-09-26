import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionofTwoArrays_Easy_350 {
    public static void main(String[] args) {
        int A[] = {4,9,5};
        int B[] = {9,5,9,8,4};
        int result[] = new IntersectionofTwoArrays_Easy_350().intersect(A,B);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> array1 = new HashMap<>();

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            if (!array1.containsKey(nums1[i]))
                array1.put(nums1[i],1);
            else
                array1.put(nums1[i], array1.get(nums1[i]) + 1);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (array1.containsKey(nums2[i]) && array1.get(nums2[i]) > 0)
            {
                result.add(nums2[i]);
                array1.put(nums2[i], array1.get(nums2[i]) - 1);
            }
        }

        int answer[] = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}
