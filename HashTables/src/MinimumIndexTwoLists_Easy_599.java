//import java.util.*;
//
//public class MinimumIndexTwoLists_Easy_599 {
//    public static void main(String[] args) {
////        String[] first = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
////        String[] second = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse",
////                "Shogun"};
//        String[] first = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
//        String[] second = {"KFC", "Shogun", "Burger King"};
//        new MinimumIndexTwoLists_Easy_599().findRestaurant(first, second);
//    }
//
//    public String[] findRestaurant(String[] list1, String[] list2) {
//        int max = 0;
//        Map<String, Integer> map = new HashMap<>();
//        List<String> list = new ArrayList<>();
//
//        for (String val:
//             list1) {
//            map.put(val, map.getOrDefault(val, 0) + 1);
//            max = Math.max(max,map.get(val));
//        }
//
//        for (String val:
//                list2) {
//            map.put(val, map.getOrDefault(val, 0) + 1);
//            max = Math.max(max,map.get(val));
//        }
//
//        for (Map.Entry<String, Integer> entry:
//             map.entrySet()) {
//            if (entry.getValue() == max && entry.getValue() > 1)
//                list.add(entry.getKey());
////                System.out.println(entry.getKey());
//        }
//        int index1 = 0, index2 = 0;
//
//        if (list.size() > 1){
//            int min;
//            for (String word: list) {
//                for (int i = 0; i < list1.length; i++) {
//                      index1 = i;
//                }
//
//                for (int i = 0; i < list2.length; i++) {
//                    index2 = i;
//                }
//
//
////                min = Math.min(index1 + index2, min);
////                System.out.println(min);
//            }
//        }
//
//        return new String[0];
//    }
//}



public class MinimumIndexTwoLists_Easy_599 {
    public static void main(String[] args) {
        int arr[] = {256741038, 623958417, 467905213, 714532089, 938071625};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int val;

        for(int i = 0; i < arr.length; i++){
            val = 0;

            for (int j = 0; j < arr.length; j++){
                if (j != i)
                    val += arr[j];
            }

            if (val < min)
                min = val;

            if (val > max)
                max = val;

        }

        System.out.println(min + " " + max);
    }
}