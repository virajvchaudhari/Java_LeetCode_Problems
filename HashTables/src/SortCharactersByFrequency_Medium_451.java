import java.util.*;

public class SortCharactersByFrequency_Medium_451 {
    public static void main(String[] args) {
        new SortCharactersByFrequency_Medium_451().frequencySort("tree");
    }

    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for (char c : s.toCharArray() ) {
            map.put(c,map.getOrDefault(c,0) + 1);
        }

        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
//        Overriding comparator method using lambda expression.
        Collections.sort(list, (v1,v2) -> v2.getValue() - v1.getValue());

        StringBuffer buffer = new StringBuffer();

        for (Map.Entry<Character,Integer> val: list) {
            for (int i = 0; i < val.getValue(); i++)
                buffer.append(val.getKey());
        }

        System.out.println("buffer.toString() = " + buffer.toString());

        return buffer.toString();
    }
}


/**
 * Previous method solution.
 */

/*
public class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        List<Character> [] bucket = new List[s.length() + 1];
        for (char key : map.keySet()) {
            int frequency = map.get(key);
            if (bucket[frequency] == null) bucket[frequency] = new ArrayList<>();
            bucket[frequency].add(key);
        }

        StringBuilder sb = new StringBuilder();
        for (int pos = bucket.length - 1; pos >= 0; pos--)
            if (bucket[pos] != null)
                for (char c : bucket[pos])
                    for (int i = 0; i < map.get(c); i++)
                        sb.append(c);

        return sb.toString();
    }
}
 */