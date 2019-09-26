import java.util.ArrayList;
import java.util.Arrays;

public class ReorderLogFiles_Easy_937 {
    public static void main(String[] args) {
        String A[] =  {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"};
        new ReorderLogFiles_Easy_937().reorderLogFiles(A);
    }

    public String[] reorderLogFiles(String[] logs) {
        ArrayList<String> digits = new ArrayList<>();
        ArrayList<String> letters = new ArrayList<>();

        for (String w:logs) {
           if (Character.isDigit(w.substring(w.indexOf(" ")+1,w.indexOf(" ")+2).toCharArray()[0]))
           {
                   digits.add(w);
           }
           else {
               letters.add(w);
           }
        }

        Arrays.sort(letters.toArray());
        Arrays.sort(digits.toArray());
//        Collections.sort(letters);
//        Collections.sort(digits);
        letters.addAll(letters.size(),digits);

        for (String val: letters) System.out.println(val);

        String A[] =  {"a","b"};
        return A;
    }
}
