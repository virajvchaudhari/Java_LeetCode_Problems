import java.util.StringTokenizer;

public class ValidPalindrome_Easy_125 {
    public static void main(String[] args) {
        System.out.println(new ValidPalindrome_Easy_125().isPalindrome("A man, a plan, a canal: Panama"));
    }

    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^\\w]","").toLowerCase();
        return s.equals(new StringBuilder(s).reverse().toString())? true: false;

        /**
         *  Another method. But previous one is better slightly.
         */
        /*s = s.replaceAll("[^\\w]","").toLowerCase();
        boolean flag = true;
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)){
                flag = false;
                break;
            }
        }

        if (flag)
            return true;

        return false;*/
    }
}
