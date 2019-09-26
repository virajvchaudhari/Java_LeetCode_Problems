import java.awt.List;
import java.util.*;

public class UncommonWordsTwoSent_Easy_884 {
    public static void main(String[] args) {
        String A = "this apple is sweet";
        String B = "this apple is sour";
        String result[];
        result = new UncommonWordsTwoSent_Easy_884().uncommonFromSentences(A,B);
        for (String val : result) {
            System.out.println(val);
        }
    }

    public String[] uncommonFromSentences(String A, String B) {
        ArrayList<String> res = new ArrayList<>();
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        for (String word : A.split("\\s")) {
            map1.put(word,map1.getOrDefault(word,0) + 1);
        }

        for (String word : B.split("\\s")) {
            map2.put(word,map2.getOrDefault(word,0) + 1);
        }

        for (Map.Entry<String,Integer> entry : map1.entrySet()) {
            if (!entry.getValue().equals(1))
                continue;
//                map1.remove(entry.getKey());
            else{
                if (!map2.containsKey(entry.getKey())){
                    res.add(entry.getKey());
                }
            }
        }

        for (Map.Entry<String,Integer> entry : map2.entrySet()) {
            if (!entry.getValue().equals(1))
                continue;
//                map2.remove(entry.getKey());
            else{
                if (!map1.containsKey(entry.getKey())){
                    res.add(entry.getKey());
                }
            }
        }

//        String out[] = new String[res.size()];
//        int i = 0;
//        for (String val : res) {
//            out[i++] = val;
//        }
//        return out;
        return res.toArray(new String[0]);
    }

//    public String[] uncommonFromSentences(String A, String B) {
//        Map<String, Integer> count = new HashMap<>();
//        for (String w : (A + " " + B).split(" ")){
//            System.out.println(w);
//            count.put(w, count.getOrDefault(w, 0) + 1);}
//        ArrayList<String> res = new ArrayList<>();
//        for (String w : count.keySet())
//            if (count.get(w) == 1)
//                res.add(w);
//        return res.toArray(new String[0]);
//    }
}
