import java.util.HashSet;

public class IntersectionArray_Easy{
    public static void main(String[] args) {
        int nums1[] = {4,9,5};
        int nums2[] = {9,4,9,8,4};
        int result[] = new IntersectionArray_Easy().intersection(nums1,nums2);
//        for (int el:result)
//            System.out.println(el);
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet();
        HashSet<Integer> hs2 = new HashSet();

        for (int el:nums1) hs1.add(el);
        for (int el: nums2) hs2.add(el);

        if (hs1.size() > hs2.size()) {
            hs1.retainAll(hs2);
            for (int el : hs1){
                System.out.println(el);
            }
            int result[] = new int[hs2.size()];
            int i = 0;
            for (Integer val : hs1) result[i++] = val;
            return result;
        }
        else {
            hs2.retainAll(hs1);
            for (int el : hs2)
                System.out.println("2nd " + el);
            int result[] = new int[hs1.size()];
            int i = 0;
            for (Integer val : hs1) result[i++] = val;
            return result;
        }
    }
}
