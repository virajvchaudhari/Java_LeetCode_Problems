import java.util.*;

public class LongestWordInDictionary_Easy_720 {
    public static void main(String[] args) {
        String A[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        System.out.println(new LongestWordInDictionary_Easy_720().longestWord(A));
    }

    public String longestWord(String[] words) {
        Set<String> set = new HashSet<>();
        Arrays.sort(words);
        String result = "";

        for (String word:words) {
            if (word.length() == 1 || set.contains(word.substring(0,word.length() - 1))){
                if (word.length() > result.length())
                    result = word;
                set.add(word);
            }
        }

        return result;
    }
}

/*

    public String longestWord(String[] words) {
        int max = 0;
        HashMap<String,Integer> map = new HashMap<>();
        ArrayList<String> result = new ArrayList<>();

        Arrays.sort(words);

        String prev = "";
        for (String word : words) {
            if (word.contains(prev)){
                map.put(word,word.length());
                max = Math.max(max, map.get(word));
                prev = word;
            }
        }

        System.out.println(map);
        for (Map.Entry val: map.entrySet()) {
            if (val.getValue().equals(max)){
                result.add(val.getKey().toString());
                ;            }
        }

        if (result.size() == 1){
            return result.get(0);
        }
        else {
            Collections.sort(result);
            return result.get(0);
        }
    }*/
