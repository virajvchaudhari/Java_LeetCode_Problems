import java.util.*;

public class MostCommonWord_Easy_819 {

    public static void main(String[] args) {
        String input = "Bob. hIt baLl";

        String banned[] = {"bob","hit"};
        System.out.println(new MostCommonWord_Easy_819().mostCommonWord(input, banned));
    }

    /*public String mostCommonWord(String paragraph, String[] banned) {
        int max = 0;
        Map<String, Integer> map = new HashMap<>();

        for (String word : paragraph.toLowerCase().split("[^\\w]+")) {
            map.put(word, map.getOrDefault(word,0) + 1);
            max = Math.max(map.get(word),max);
            for (String val : banned) {
                if (map.containsKey(val) && max == map.get(val)){
                    map.remove(val);
                }
                if (!map.values().contains(max))
                    max = Math.max(map.getOrDefault(word,0),max);
            }
        }
        System.out.println(map);

        String result = "";
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            if (entry.getValue().equals(max))
                result = entry.getKey();
        }

        return result;
    }*/

    /**
     *  This solution is much better. In terms of runtime performance.
     */
/*
    public String mostCommonWord(String paragraph, String[] banned) {
        String result = "";
//        int max = 0;
        Map<String, Integer> map = new HashMap<>();
        Set<String> isBan = new HashSet<>(Arrays.asList(banned));


//        for(String word : banned)
//            isBan.add(word.toLowerCase());

        for (String word : paragraph.toLowerCase().split("[^\\w]+")) {
            if (!isBan.contains(word)){
                map.put(word, map.getOrDefault(word,0) + 1);
//                max = Math.max(map.get(word),max);
            }
        }

//        for (Map.Entry<String,Integer> entry : map.entrySet()){
//            if (entry.getValue().equals(max))
//                result = entry.getKey();
//        }

        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
*/

/**
 *  A much more improved method. But only in terms of lines of code.
 */

public String mostCommonWord(String paragraph, String[] banned) {
    Map<String, Integer> map = new HashMap<>();
    Set<String> isBan = new HashSet<>(Arrays.asList(banned));

    for (String word : paragraph.toLowerCase().split("[^\\w]+")) {
        if (!isBan.contains(word))
            map.put(word, map.getOrDefault(word, 0) + 1);
    }
    return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
