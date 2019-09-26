public class Palindrome_Easy_9 {
    public static void main(String[] args) {
        System.out.println(new Palindrome_Easy_9().isPalindrome(0));
    }

    public boolean isPalindrome(int x) {
        String val = Integer.toString(x);

        if (val.length() == 1) return false;

        for (int i = 0, j = val.length() - 1; i < val.length()/2; i++, j--) {
            if (!(val.charAt(i) == val.charAt(j)))
                return false;
        }
        return true;
    }
}
