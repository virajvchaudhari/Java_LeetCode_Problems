import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAndReplace_Medium {
    public static void main(String[] args) {
        String words[] = {"abc","deq","mee","aqq","dkd","ccc"};
        String pattern = "abb";
        new FindAndReplace_Medium().findAndReplacePattern(words,pattern);
    }

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> arr = new ArrayList<>();
        System.out.println(words.toString().toCharArray());
        return arr;
    }

}
