import java.util.HashMap;
import java.util.Map;

public class FindDifference_Easy_389 {
    public static void main(String[] args) {
        System.out.println(new FindDifference_Easy_389().findTheDifference(
                        "abcd",


               "abcde" ));
    }

    public char findTheDifference(String s, String t) {

        /**
         * Better solution.
         */
        int charCode = t.charAt(s.length());
        System.out.println(charCode);

        // Iterate through both strings and char codes

        for (int i = 0; i < s.length(); ++i) {
            charCode -= (int)s.charAt(i);
            charCode += (int)t.charAt(i);
        }

        return (char)charCode;

/*
        HashMap<Character,Integer> hash1 = new HashMap<>();
        char c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (hash1.containsKey(s.charAt(i)))
                hash1.put(s.charAt(i),hash1.get(s.charAt(i)) + 1);
            else
                hash1.put(s.charAt(i),1);
        }

        for (int i = 0; i < t.length(); i++) {
            if (!hash1.containsKey(t.charAt(i))){
                c = t.charAt(i);
            }else{
                hash1.put(t.charAt(i),hash1.get(t.charAt(i)) - 1);
            }
        }

        if (c != 0){
            return c;
        }
        else{
            for (Map.Entry entry : hash1.entrySet()) {
                if (!entry.getValue().equals(0)){
                    return (char) entry.getKey();
                }
            }
        }
        return 'a';
*/
    }
}
