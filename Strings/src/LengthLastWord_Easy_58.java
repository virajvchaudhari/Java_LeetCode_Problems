import java.util.ArrayList;
import java.util.List;

public class LengthLastWord_Easy_58 {
    public static void main(String[] args) {
        System.out.println(new LengthLastWord_Easy_58().lengthOfLastWord("Hello World mag"));
    }

//    public int lengthOfLastWord(String s) {
//
//        if (s.length() == 0) return 0;
//        List<String> list = new ArrayList<>();
//
//        for (String ip : s.split("\\s")) {
//            list.add(ip);
//        }
//        if (list.size() > 0)
//            return list.get(list.size() - 1).length();
//        else
//            return 0;
//
//    }

    /***
     * Another variation. : Best solution.
     * @param s : string input
     * @return last word's length
     */
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int lastIndex = s.lastIndexOf(' ') + 1;
        return s.length() - lastIndex;
    }
}
