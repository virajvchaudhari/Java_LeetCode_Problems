public class ReverseOnlyLetters_Easy_917 {
    public static void main(String[] args) {
        System.out.println(new ReverseOnlyLetters_Easy_917().reverseOnlyLetters("a-bC-dEf-ghIj"));
    }

    /*public String reverseOnlyLetters(String S) {

        StringBuffer res = new StringBuffer();

        int j = 0;
        for (int i = S.length() - 1; i >= 0; i--) {
            if (!Character.isLetter(S.charAt(j))){
                char val = S.charAt(j);
                res.append(val);
                j++;
            }
            if (!Character.isLetter(S.charAt(i)))
                continue;
            else
                res.append(S.charAt(i));
            j++;
        }

        if (j <= S.length() - 1 && !Character.isAlphabetic(S.charAt(j))) {
            char val = S.charAt(j);
            res.append(val);
        }

        return res.toString();
    }*/

    public String reverseOnlyLetters(String S) {
        StringBuilder sb = new StringBuilder(S);

        for (int i = 0, j = S.length() - 1; i < j;){
            if (!Character.isLetter(sb.charAt(i)))
                ++i;
            else if (!Character.isLetter(sb.charAt(j)))
                --j;
            else{
                sb.setCharAt(i,S.charAt(j));
                sb.setCharAt(j--,S.charAt(i++));}
        }
        return sb.toString();
    }
}
