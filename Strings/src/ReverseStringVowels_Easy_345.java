public class ReverseStringVowels_Easy_345 {
    public static void main(String[] args) {
        new ReverseStringVowels_Easy_345().reverseVowels("Hello");
    }

    public boolean isVowel(char c)
    {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public String reverseVowels(String s) {
        for (int i = 0; i < s.length(); i++) {
             if (isVowel(s.charAt(i))){
                 int index = i;
             }
        }
        return "abc";
    }
}
