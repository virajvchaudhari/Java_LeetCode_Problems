import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome_Easy_409 {
    public static void main(String[] args) {
        new LongestPalindrome_Easy_409().longestPalindrome("bababa");
    }

    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i)))
                set.add(s.charAt(i));
            else{
                set.remove(s.charAt(i));
                count += 2;
            }
        }

        System.out.println(count);
        if (set.size() > 1 && count != 0)
            System.out.println(count + 1);
        else
            System.out.println(count);
        return 0;
    }
}
