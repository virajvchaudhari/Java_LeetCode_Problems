import java.util.*;

public class TopKFrequentElements_Medium_347 {
    public static void main(String[] args) {
        int A[] = {1};
        List<Integer> result;
        result = new TopKFrequentElements_Medium_347().topKFrequent(A,1);
        for (int val: result) {
            System.out.print(val + " ");
        }
    }

    public List<Integer> topKFrequent(int[] nums, int k) {

        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int val: nums) {
            map.put(val,map.getOrDefault(val,0) + 1);
            max = Math.max(map.get(val), max);
        }

        List<Integer>[] bucket = new ArrayList[max+1];
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int freq = entry.getValue();
            if (bucket[freq] == null)
                bucket[freq] = new ArrayList<>();
            bucket[freq].add(entry.getKey());
        }

        List<Integer> res = new ArrayList<>();
        for (int i = max; i >= 0 && res.size() < k; i--) {
            if (bucket[i] != null){
                Collections.sort(bucket[i]);
                res.addAll(bucket[i]);
            }
        }
        return res.subList(0,k);

    }
}
