public class StringReverse_Easy {
    public static void main(String[] args) {
        char A[] = {'h','e','l','l','o'};
        new StringReverse_Easy().reverseString(A);
    }
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length/2; i++){
            char temp;
            temp = s[i];
            s[i] = s[s.length- 1- i];
            s[s.length - 1 - i] = temp;
        }
        System.out.println(s);
    }
}
