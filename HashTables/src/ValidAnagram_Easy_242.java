import java.util.HashMap;

public class ValidAnagram_Easy_242 {
    public static void main(String[] args) {
        System.out.println(new ValidAnagram_Easy_242().isAnagram("anagram", "nagaram"));
    }

    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hash1 = new HashMap<>();
        HashMap<Character, Integer> hash2 = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (hash1.containsKey(s.charAt(i))) {
                hash1.put(s.charAt(i), hash1.get(s.charAt(i)) + 1);
            } else {
                hash1.put(s.charAt(i), 1);
            }
        }


        for (int i = 0; i < t.length(); i++) {
            if (!(hash1.containsKey(t.charAt(i)))) {
                return false;
            }
        }


//        for (int i = 0; i < t.length(); i++) {
//            if (hash2.containsKey(t.charAt(i))){
//                hash2.put(t.charAt(i), hash2.get(t.charAt(i)) + 1);
//            }else {
//                hash2.put(t.charAt(i), 1);
//            }
//        }
//
//        if (hash1.equals(hash2)){
//            return true;
//        }

        return true;
    }
}


/**
 * Better solution.
 */

/*
    public boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26];

        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++)
        {
            alphabet[t.charAt(i) - 'a']--;
        }
        for (int i : alphabet) {
            if (i != 0)
                return false;
        }
        return true;
    }

 */