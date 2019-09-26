import java.util.Arrays;

public class FindWordsFormByChar_Easy_1160 {
    public static void main(String[] args) {
        String words[] = {"hello","world","leetcode"};
        String chars = "welldonehoneyr";
        new FindWordsFormByChar_Easy_1160().countCharacters(words, chars);
    }

    public int countCharacters(String[] words, String chars) {
        int ret_val = 0;
        int dict[] = new int[26];
//       Chars string input into hashtable.
        for (char ch : chars.toCharArray()) {
            dict[ch - 'a']++;
        }
        int dict2[] = dict;
        for (int i = 0; i < 26; i++) {
            System.out.print(dict[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 26; i++) {
            System.out.print(dict2[i] + " ");
        }

        for (String word : words) {
            int count = 0;
            int curr[] = Arrays.copyOf(dict, dict.length);

            for (char c : word.toCharArray()) {
                if (curr[c - 'a'] > 0) {
                    curr[c - 'a']--;
                    count++;
                }
            }

            System.out.println(count + "  " + word.length());
            if (count == word.length())
                ret_val += count;
        }
        System.out.println(ret_val);
        return ret_val;
    }
}
