public class strStr_Easy_28 {
    public static void main(String[] args) {
        String haystack = "aaaa", needle = "aaa";
        System.out.println(new strStr_Easy_28().strStr(haystack, needle));
    }

    public int strStr(String haystack, String needle) {
        if ((haystack.length() == 0 && needle.length() == 0) || haystack.equals(needle))
            return 0;

        if (haystack.length() != 0) {
            for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
                if (haystack.substring(i, i + needle.length()).equals(needle))
                    return i;
            }
        }
        return -1;
    }
}