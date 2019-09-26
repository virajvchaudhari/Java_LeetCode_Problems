import java.util.*;

public class KMostFrequent_Medium_692 {
    public static void main(String[] args) {
        String A[] = {"i", "love", "leetcode", "i", "love", "coding"};
        new KMostFrequent_Medium_692().topKFrequent(A, 2);
    }

    public List<String> topKFrequent(String[] words, int k){

//      For obtaining the max_repeated value count.
        int max_val = 0;
        HashMap<String, Integer> map = new HashMap<>();

//      Adding the words to the dictionary with their repetition count.
        for (String word : words) {
            map.put(word, map.getOrDefault(word,0) + 1);
            max_val = Math.max(max_val, map.get(word));
        }

        List<String>[] bucket = new ArrayList[max_val + 1];

        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            int freq = entry.getValue();
            if (bucket[freq] == null)
                bucket[freq] = new ArrayList<>();
            bucket[freq].add(entry.getKey());
        }

        List<String> res = new ArrayList<>();
        for (int i = max_val; i >= 0 && res.size() < k; i--) {
            if (bucket[i] != null){
                Collections.sort(bucket[i]);
                res.addAll(bucket[i]);
            }
        }

        return res.subList(0,k);
    }
}
