// My solution time limit exceeded

public class ReverseWords_Easy {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
//    public String reverseWords(String s) {
//        StringBuilder str = new StringBuilder(s);
//        str.reverse();
//        int i = str.length() - 1;
//        int start, end = i + 1;
//        String result = "";
//
//        while(i >= 0){
//            if (str.charAt(i) == ' '){
//                start = i + 1;
//                while(start != end){
//                    result += str.charAt(start++);
//                }
//                result += ' ';
//                end = i;
//            }
//            i--;
//        }
//        start = 0;
//        while(start != end) {
//            result += str.charAt(start++);
//        }
//        return result;
//    }

    static String reverseWords(String s) {
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            str[i] = new StringBuilder(str[i]).reverse().toString();
        }
        StringBuilder result = new StringBuilder();
        for (String st : str) result.append(st + " ");
        return result.toString().trim();
    }
}


/* A simpler and better solution above */

