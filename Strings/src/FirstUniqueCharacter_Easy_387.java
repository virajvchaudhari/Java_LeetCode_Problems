public class FirstUniqueCharacter_Easy_387 {
    public static void main(String[] args) {
        System.out.println(new FirstUniqueCharacter_Easy_387().firstUniqChar("loveleetcode"));
    }

    public int firstUniqChar(String s) {
        int freq[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1)
                return i;
        }

        return -1;
    }






//    Time Limit Exceeded

   /* public int firstUniqChar(String s) {
        if (s.length() == 1) return 0;

        for (int i = 0; i < s.length(); i++) {
            boolean flag = true;
            char c = s.charAt(i);
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) == c){
                    flag = false;
                }
            }
            if (flag){
                for (int x = 0; x < i; x++) {
                    if (s.charAt(x) == c)
                        flag = false;
                }
            }
            if (flag)
                return i;
        }
        return -1;
    }*/
}
