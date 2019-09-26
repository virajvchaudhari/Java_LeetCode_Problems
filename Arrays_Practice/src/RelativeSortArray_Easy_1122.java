//import java.util.*;
//
//public class RelativeSortArray_Easy_1122 {
//    public static void main(String[] args) {
//        int A1[] = {2,3,1,3,2,4,6,7,9,2,19};
//        int A2[] = {2,1,4,3,9,6};
//        new RelativeSortArray_Easy_1122().relativeSortArray(A1,A2);
//    }
//
//    /*public int[] relativeSortArray(int[] arr1, int[] arr2) {
//        Set<Integer> set = new HashSet<>();
//        ArrayList<Integer> list = new ArrayList<>();
//        Set<Integer> list2 = new HashSet<>();
//
//        for (int val: arr2) {
//            set.add(val);
//        }
//
//        int k = 0;
//
//        for (int i = 0; i < arr2.length; i++) {
//            for (int j = 0; j < arr1.length; j++) {
//                if (arr2[i] == arr1[j]){
//                    list.add(arr1[j]);
//                }
//                else{
//                    if (!set.contains(arr1[j]))
//                        list2.add(arr1[j]);
//                }
//            }
//        }
//        list.addAll(list2);
//
//        for (int val:
//             list) {
//            System.out.println("val = " + val);
//        }
//
//        for (int i = 0; i < list.size(); i++) {
//            arr1[i] = list.get(i);
//        }
//        return arr1;
//    }
//*/
////    public int[] relativeSortArray(int[] arr1, int[] arr2){
////
////        return new int[2];
////    }
//
//    public int[] relativeSortArray(int[] arr1, int[] arr2){
//        int k = 0;
//        int[] cnt = new int[1001], ans = new int[arr1.length];
//
//        List<Integer> grades = new ArrayList<>();
//        grades.se
//
//        for (int i: arr1) {
//            ++cnt[i];
//        }
//
//        for (int i: arr2) {
//            while(cnt[i]-- > 0)
//                ans[k++] = i;
//        }
//
//        for (int i = 0; i < cnt.length; i++) {
//            System.out.println(cnt[i] + " ");
//        }
//
//        return new int[0];
//    }
//
//
////    public int[] relativeSortArray(int[] arr1, int[] arr2) {
////        int k = 0;
////        int[] cnt = new int[1001], ans = new int[arr1.length];
////        for (int i : arr1)                      // Count each number in arr1.
////            ++cnt[i];
////        for (int i : arr2)                      // Sort the common numbers in both arrays by the order of arr2.
////            while (cnt[i]-- > 0)
////                ans[k++] = i;
////        for (int i = 0; i < 1001; ++i)          // Sort the numbers only in arr1.
////            while (cnt[i]-- > 0)
////                ans[k++] = i;
////        return ans;
////    }
//}
